/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.resolve.bindingContextUtil

import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.psi.JetReturnExpression
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.resolve.BindingContext.LABEL_TARGET
import org.jetbrains.kotlin.resolve.BindingContext.FUNCTION
import org.jetbrains.kotlin.resolve.BindingContext.DECLARATION_TO_DESCRIPTOR
import org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType
import org.jetbrains.kotlin.psi.JetDeclarationWithBody
import org.jetbrains.kotlin.resolve.DescriptorUtils
import org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor
import org.jetbrains.kotlin.psi.JetExpression
import org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo
import org.jetbrains.kotlin.resolve.calls.context.ResolutionContext

public fun JetReturnExpression.getTargetFunctionDescriptor(context: BindingContext): FunctionDescriptor? {
    val targetLabel = getTargetLabel()
    if (targetLabel != null) return context[LABEL_TARGET, targetLabel]?.let { context[FUNCTION, it] }

    val declarationDescriptor = context[DECLARATION_TO_DESCRIPTOR, getNonStrictParentOfType<JetDeclarationWithBody>()]
    val containingFunctionDescriptor = DescriptorUtils.getParentOfType(declarationDescriptor, javaClass<FunctionDescriptor>(), false)
    if (containingFunctionDescriptor == null) return null

    return stream(containingFunctionDescriptor) { DescriptorUtils.getParentOfType(it, javaClass<FunctionDescriptor>()) }
            .dropWhile { it is AnonymousFunctionDescriptor }
            .firstOrNull()
}

public fun JetExpression.isUsedAsExpression(context: BindingContext): Boolean = context[BindingContext.USED_AS_EXPRESSION, this]!!
public fun JetExpression.isUsedAsStatement(context: BindingContext): Boolean = !isUsedAsExpression(context)


public fun <C : ResolutionContext<C>> ResolutionContext<C>.recordScopeAndDataFlowInfo(expression: JetExpression?) {
    if (expression == null) return

    trace.record(BindingContext.RESOLUTION_SCOPE, expression, scope)
    if (dataFlowInfo != DataFlowInfo.EMPTY) {
        trace.record(BindingContext.EXPRESSION_DATA_FLOW_INFO, expression, dataFlowInfo)
    }
}

public fun BindingContext.getDataFlowInfo(expression: JetExpression?): DataFlowInfo =
    expression?.let { this[BindingContext.EXPRESSION_DATA_FLOW_INFO, it] } ?: DataFlowInfo.EMPTY

public fun JetExpression.isUnreachableCode(context: BindingContext): Boolean = context[BindingContext.UNREACHABLE_CODE, this]!!


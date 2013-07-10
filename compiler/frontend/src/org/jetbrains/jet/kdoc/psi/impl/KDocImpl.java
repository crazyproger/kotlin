/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.kdoc.psi.impl;

import com.intellij.lang.Language;
import com.intellij.psi.PsiDocCommentOwner;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LazyParseablePsiElement;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.javadoc.PsiDocTag;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.kdoc.lexer.KDocTokens;
import org.jetbrains.jet.kdoc.psi.api.KDoc;
import org.jetbrains.jet.lexer.JetTokens;
import org.jetbrains.jet.plugin.JetLanguage;

public class KDocImpl extends LazyParseablePsiElement implements KDoc {
    public KDocImpl(CharSequence buffer) {
        super(KDocTokens.KDOC, buffer);
    }

    @NotNull
    @Override
    public Language getLanguage() {
        return JetLanguage.INSTANCE;
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }

    @Override
    public IElementType getTokenType() {
        return JetTokens.DOC_COMMENT;
    }

    @Nullable
    @Override
    public PsiDocCommentOwner getOwner() {
        return PsiTreeUtil.getNextSiblingOfType(this, PsiDocCommentOwner.class);
    }

    @NotNull
    @Override
    public PsiElement[] getDescriptionElements() {
        return new PsiElement[0];
    }

    @NotNull
    @Override
    public PsiDocTag[] getTags() {
        return PsiDocTag.EMPTY_ARRAY;
    }

    @Nullable
    @Override
    public PsiDocTag findTagByName(@NonNls String name) {
        return null;
    }

    @NotNull
    @Override
    public PsiDocTag[] findTagsByName(@NonNls String name) {
        return PsiDocTag.EMPTY_ARRAY;
    }
}

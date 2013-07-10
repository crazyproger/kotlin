package org.jetbrains.jet.asJava.wrappers;

import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.compiled.ClsModifierListImpl;
import com.intellij.psi.impl.java.stubs.PsiModifierListStub;
import org.jetbrains.annotations.NotNull;

public class JetClsModifierListImpl extends ClsModifierListImpl {

    @NotNull
    private final PsiElement origin;

    public JetClsModifierListImpl(@NotNull PsiModifierListStub stub, @NotNull PsiElement origin) {
        super(stub);
        this.origin = origin;
    }

    @Override
    public PsiElement getMirror() {
        return origin;
    }

    @NotNull
    @Override
    public PsiElement getNavigationElement() {
        return origin;
    }
}

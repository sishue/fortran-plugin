package org.jetbrains.fortran.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FortranLabel extends FortranCompositeElement {

    @NotNull
    PsiElement getIntegerliteral();

    int gelLabelValue();
}

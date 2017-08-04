package org.jetbrains.fortran.lang.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import org.jetbrains.fortran.lang.FortranTypes
import org.jetbrains.fortran.lang.psi.FortranConstructLabelDecl
import org.jetbrains.fortran.lang.psi.ext.FortranNamedElementImpl
import org.jetbrains.fortran.lang.FortranTypes.IDENTIFIER
import org.jetbrains.fortran.lang.psi.FortranElementFactory

abstract class FortranConstructLabelDeclImplMixin(node : ASTNode) : FortranNamedElementImpl(node), FortranConstructLabelDecl {
    override fun getNameIdentifier(): PsiElement = notNullChild(findChildByType(IDENTIFIER))

    override fun setName(name: String): PsiElement? {
        val keyNode : LeafPsiElement = findNotNullChildByType(FortranTypes.IDENTIFIER)
        node.replaceChild(keyNode.node, LeafPsiElement(FortranTypes.IDENTIFIER, name).node)
        return this
    }

    fun gelLabelValue() = nameIdentifier.text
}
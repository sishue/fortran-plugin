package org.jetbrains.fortran.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import org.jetbrains.fortran.highlighter.FortranHighlightingColors
import org.jetbrains.fortran.lang.FortranTypes.*
import org.jetbrains.fortran.lang.psi.FortranTokenType.KEYWORDS

class FortranHighlightingAnnotator : Annotator {

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element.node.elementType === IDENTIFIER) {
            holder.createInfoAnnotation(element, null).textAttributes = FortranHighlightingColors.IDENTIFIER.textAttributesKey
        }
        if (element.node.elementType in KEYWORDS) {
            holder.createInfoAnnotation(element, null).textAttributes = FortranHighlightingColors.KEYWORD.textAttributesKey
        }
    }
}


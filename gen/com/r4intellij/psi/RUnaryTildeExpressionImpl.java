// This is a generated file. Not intended for manual editing.
package com.r4intellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.r4intellij.parsing.RElementTypes.*;
import com.r4intellij.psi.api.*;

public class RUnaryTildeExpressionImpl extends RExpressionImpl implements RUnaryTildeExpression {

  public RUnaryTildeExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RVisitor visitor) {
    visitor.visitUnaryTildeExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RVisitor) accept((RVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, RExpression.class);
  }

  @Override
  @NotNull
  public ROperator getOperator() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, ROperator.class));
  }

}

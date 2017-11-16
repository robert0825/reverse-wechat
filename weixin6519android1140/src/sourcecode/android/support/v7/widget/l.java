package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.support.v7.e.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class l
{
  private static final int[] Pg = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private static final int[] Ph = { a.a.textAllCaps };
  final TextView Pi;
  private an Pj;
  private an Pk;
  private an Pl;
  private an Pm;
  
  l(TextView paramTextView)
  {
    this.Pi = paramTextView;
  }
  
  protected static an a(Context paramContext, h paramh, int paramInt)
  {
    paramContext = paramh.f(paramContext, paramInt);
    if (paramContext != null)
    {
      paramh = new an();
      paramh.Ys = true;
      paramh.Yq = paramContext;
      return paramh;
    }
    return null;
  }
  
  static l d(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new m(paramTextView);
    }
    return new l(paramTextView);
  }
  
  private void setAllCaps(boolean paramBoolean)
  {
    TextView localTextView = this.Pi;
    if (paramBoolean) {}
    for (a locala = new a(this.Pi.getContext());; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
  
  final void a(Drawable paramDrawable, an paraman)
  {
    if ((paramDrawable != null) && (paraman != null)) {
      h.a(paramDrawable, paraman, this.Pi.getDrawableState());
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int j = 1;
    Context localContext = this.Pi.getContext();
    Object localObject = h.ex();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, Pg, paramInt, 0);
    int i = localTypedArray.getResourceId(0, -1);
    if (localTypedArray.hasValue(1)) {
      this.Pj = a(localContext, (h)localObject, localTypedArray.getResourceId(1, 0));
    }
    if (localTypedArray.hasValue(2)) {
      this.Pk = a(localContext, (h)localObject, localTypedArray.getResourceId(2, 0));
    }
    if (localTypedArray.hasValue(3)) {
      this.Pl = a(localContext, (h)localObject, localTypedArray.getResourceId(3, 0));
    }
    if (localTypedArray.hasValue(4)) {
      this.Pm = a(localContext, (h)localObject, localTypedArray.getResourceId(4, 0));
    }
    localTypedArray.recycle();
    boolean bool;
    if (!(this.Pi.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      if (i == -1) {
        break label268;
      }
      localObject = localContext.obtainStyledAttributes(i, a.k.TextAppearance);
      if (!((TypedArray)localObject).hasValue(a.k.TextAppearance_textAllCaps)) {
        break label260;
      }
      bool = ((TypedArray)localObject).getBoolean(a.k.TextAppearance_textAllCaps, false);
      i = 1;
      ((TypedArray)localObject).recycle();
    }
    for (;;)
    {
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, Ph, paramInt, 0);
      if (paramAttributeSet.hasValue(0)) {
        bool = paramAttributeSet.getBoolean(0, false);
      }
      for (paramInt = j;; paramInt = i)
      {
        paramAttributeSet.recycle();
        if (paramInt != 0) {
          setAllCaps(bool);
        }
        return;
      }
      label260:
      i = 0;
      bool = false;
      break;
      label268:
      i = 0;
      bool = false;
    }
  }
  
  void eA()
  {
    if ((this.Pj != null) || (this.Pk != null) || (this.Pl != null) || (this.Pm != null))
    {
      Drawable[] arrayOfDrawable = this.Pi.getCompoundDrawables();
      a(arrayOfDrawable[0], this.Pj);
      a(arrayOfDrawable[1], this.Pk);
      a(arrayOfDrawable[2], this.Pl);
      a(arrayOfDrawable[3], this.Pm);
    }
  }
  
  final void h(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, Ph);
    if (paramContext.hasValue(0)) {
      setAllCaps(paramContext.getBoolean(0, false));
    }
    paramContext.recycle();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
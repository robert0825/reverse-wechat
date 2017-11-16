package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.z;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.a.a.f;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public final class b
  extends i
  implements DialogInterface
{
  private a FC = new a(getContext(), this, getWindow());
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext, d(paramContext, paramInt));
  }
  
  static int d(Context paramContext, int paramInt)
  {
    if (paramInt >= 16777216) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(android.support.v7.a.a.a.alertDialogTheme, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a locala = this.FC;
    int i;
    Object localObject4;
    Object localObject3;
    Object localObject2;
    Object localObject1;
    label108:
    label114:
    label225:
    label360:
    label411:
    label460:
    label509:
    label515:
    label574:
    label591:
    int k;
    label607:
    int j;
    if ((locala.ES != 0) && (locala.EX == 1))
    {
      i = locala.ES;
      locala.Es.setContentView(i);
      paramBundle = locala.Et.findViewById(a.f.parentPanel);
      localObject4 = paramBundle.findViewById(a.f.topPanel);
      localObject3 = paramBundle.findViewById(a.f.contentPanel);
      localObject2 = paramBundle.findViewById(a.f.buttonPanel);
      localObject1 = (ViewGroup)paramBundle.findViewById(a.f.customPanel);
      if (locala.mView == null) {
        break label834;
      }
      paramBundle = locala.mView;
      if (paramBundle == null) {
        break label870;
      }
      i = 1;
      if ((i == 0) || (!a.aI(paramBundle))) {
        locala.Et.setFlags(131072, 131072);
      }
      if (i == 0) {
        break label875;
      }
      Object localObject5 = (FrameLayout)locala.Et.findViewById(a.f.custom);
      ((FrameLayout)localObject5).addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (locala.EB) {
        ((FrameLayout)localObject5).setPadding(locala.Ex, locala.Ey, locala.Ez, locala.EA);
      }
      if (locala.Ev != null) {
        ((LinearLayout.LayoutParams)((ViewGroup)localObject1).getLayoutParams()).weight = 0.0F;
      }
      paramBundle = ((ViewGroup)localObject1).findViewById(a.f.topPanel);
      View localView = ((ViewGroup)localObject1).findViewById(a.f.contentPanel);
      localObject5 = ((ViewGroup)localObject1).findViewById(a.f.buttonPanel);
      paramBundle = a.b(paramBundle, (View)localObject4);
      localObject3 = a.b(localView, (View)localObject3);
      localObject2 = a.b((View)localObject5, (View)localObject2);
      locala.EL = ((NestedScrollView)locala.Et.findViewById(a.f.scrollView));
      locala.EL.setFocusable(false);
      locala.EL.setNestedScrollingEnabled(false);
      locala.iD = ((TextView)((ViewGroup)localObject3).findViewById(16908299));
      if (locala.iD != null)
      {
        if (locala.Eu == null) {
          break label885;
        }
        locala.iD.setText(locala.Eu);
      }
      i = 0;
      locala.EC = ((Button)((ViewGroup)localObject2).findViewById(16908313));
      locala.EC.setOnClickListener(locala.EY);
      if (!TextUtils.isEmpty(locala.ED)) {
        break label979;
      }
      locala.EC.setVisibility(8);
      locala.EF = ((Button)((ViewGroup)localObject2).findViewById(16908314));
      locala.EF.setOnClickListener(locala.EY);
      if (!TextUtils.isEmpty(locala.EG)) {
        break label1006;
      }
      locala.EF.setVisibility(8);
      locala.EI = ((Button)((ViewGroup)localObject2).findViewById(16908315));
      locala.EI.setOnClickListener(locala.EY);
      if (!TextUtils.isEmpty(locala.EJ)) {
        break label1035;
      }
      locala.EI.setVisibility(8);
      if (i == 0) {
        break label1064;
      }
      i = 1;
      if (i == 0) {
        ((ViewGroup)localObject2).setVisibility(8);
      }
      if (locala.EO == null) {
        break label1069;
      }
      localObject4 = new ViewGroup.LayoutParams(-1, -2);
      paramBundle.addView(locala.EO, 0, (ViewGroup.LayoutParams)localObject4);
      locala.Et.findViewById(a.f.title_template).setVisibility(8);
      if ((localObject1 == null) || (((ViewGroup)localObject1).getVisibility() == 8)) {
        break label1278;
      }
      i = 1;
      if ((paramBundle == null) || (paramBundle.getVisibility() == 8)) {
        break label1283;
      }
      k = 1;
      if ((localObject2 == null) || (((ViewGroup)localObject2).getVisibility() == 8)) {
        break label1289;
      }
      j = 1;
      label624:
      if ((j == 0) && (localObject3 != null))
      {
        paramBundle = ((ViewGroup)localObject3).findViewById(a.f.textSpacerNoButtons);
        if (paramBundle != null) {
          paramBundle.setVisibility(0);
        }
      }
      if ((k != 0) && (locala.EL != null)) {
        locala.EL.setClipToPadding(true);
      }
      if (i == 0)
      {
        if (locala.Ev == null) {
          break label1294;
        }
        paramBundle = locala.Ev;
        label691:
        if (paramBundle != null)
        {
          if (k == 0) {
            break label1303;
          }
          i = 1;
          label702:
          if (j == 0) {
            break label1308;
          }
          j = 2;
          label708:
          i |= j;
          localObject1 = locala.Et.findViewById(a.f.scrollIndicatorUp);
          localObject2 = locala.Et.findViewById(a.f.scrollIndicatorDown);
          if (Build.VERSION.SDK_INT < 23) {
            break label1313;
          }
          z.c(paramBundle, i, 3);
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
          if (localObject2 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject2);
          }
        }
      }
    }
    for (;;)
    {
      paramBundle = locala.Ev;
      if ((paramBundle != null) && (locala.EP != null))
      {
        paramBundle.setAdapter(locala.EP);
        i = locala.EQ;
        if (i >= 0)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
      return;
      i = locala.ER;
      break;
      label834:
      if (locala.Ew != 0)
      {
        paramBundle = LayoutInflater.from(locala.mContext).inflate(locala.Ew, (ViewGroup)localObject1, false);
        break label108;
      }
      paramBundle = null;
      break label108;
      label870:
      i = 0;
      break label114;
      label875:
      ((ViewGroup)localObject1).setVisibility(8);
      break label225;
      label885:
      locala.iD.setVisibility(8);
      locala.EL.removeView(locala.iD);
      if (locala.Ev != null)
      {
        localObject4 = (ViewGroup)locala.EL.getParent();
        i = ((ViewGroup)localObject4).indexOfChild(locala.EL);
        ((ViewGroup)localObject4).removeViewAt(i);
        ((ViewGroup)localObject4).addView(locala.Ev, i, new ViewGroup.LayoutParams(-1, -1));
        break label360;
      }
      ((ViewGroup)localObject3).setVisibility(8);
      break label360;
      label979:
      locala.EC.setText(locala.ED);
      locala.EC.setVisibility(0);
      i = 1;
      break label411;
      label1006:
      locala.EF.setText(locala.EG);
      locala.EF.setVisibility(0);
      i |= 0x2;
      break label460;
      label1035:
      locala.EI.setText(locala.EJ);
      locala.EI.setVisibility(0);
      i |= 0x4;
      break label509;
      label1064:
      i = 0;
      break label515;
      label1069:
      locala.jV = ((ImageView)locala.Et.findViewById(16908294));
      if (!TextUtils.isEmpty(locala.tX)) {
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          locala.EN = ((TextView)locala.Et.findViewById(a.f.alertTitle));
          locala.EN.setText(locala.tX);
          if (locala.EM != 0)
          {
            locala.jV.setImageResource(locala.EM);
            break;
            i = 0;
            continue;
          }
          if (locala.jd != null)
          {
            locala.jV.setImageDrawable(locala.jd);
            break;
          }
          locala.EN.setPadding(locala.jV.getPaddingLeft(), locala.jV.getPaddingTop(), locala.jV.getPaddingRight(), locala.jV.getPaddingBottom());
          locala.jV.setVisibility(8);
          break;
        }
      }
      locala.Et.findViewById(a.f.title_template).setVisibility(8);
      locala.jV.setVisibility(8);
      paramBundle.setVisibility(8);
      break label574;
      label1278:
      i = 0;
      break label591;
      label1283:
      k = 0;
      break label607;
      label1289:
      j = 0;
      break label624;
      label1294:
      paramBundle = locala.EL;
      break label691;
      label1303:
      i = 0;
      break label702;
      label1308:
      j = 0;
      break label708;
      label1313:
      paramBundle = (Bundle)localObject1;
      if (localObject1 != null)
      {
        paramBundle = (Bundle)localObject1;
        if ((i & 0x1) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject1);
          paramBundle = null;
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if ((i & 0x2) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject2);
          localObject1 = null;
        }
      }
      if ((paramBundle != null) || (localObject1 != null)) {
        if (locala.Eu != null)
        {
          locala.EL.CB = new a.2(locala, paramBundle, (View)localObject1);
          locala.EL.post(new a.3(locala, paramBundle, (View)localObject1));
        }
        else if (locala.Ev != null)
        {
          locala.Ev.setOnScrollListener(new a.4(locala, paramBundle, (View)localObject1));
          locala.Ev.post(new a.5(locala, paramBundle, (View)localObject1));
        }
        else
        {
          if (paramBundle != null) {
            ((ViewGroup)localObject3).removeView(paramBundle);
          }
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    a locala = this.FC;
    if ((locala.EL != null) && (locala.EL.executeKeyEvent(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    a locala = this.FC;
    if ((locala.EL != null) && (locala.EL.executeKeyEvent(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    this.FC.setTitle(paramCharSequence);
  }
  
  public static final class a
  {
    public final a.a FD;
    public int nW;
    
    public a(Context paramContext)
    {
      this(paramContext, b.d(paramContext, 0));
    }
    
    private a(Context paramContext, int paramInt)
    {
      this.FD = new a.a(new ContextThemeWrapper(paramContext, b.d(paramContext, paramInt)));
      this.nW = paramInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
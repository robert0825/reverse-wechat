package com.tencent.mm.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.v.a.i;
import java.util.Locale;

public final class a
{
  private AccessibilityManager iz;
  Vibrator jsv;
  public Context sN;
  public TextToSpeech vOV;
  
  public a(Context paramContext)
  {
    GMTrace.i(1875155877888L, 13971);
    this.vOV = null;
    this.sN = paramContext;
    this.iz = ((AccessibilityManager)this.sN.getSystemService("accessibility"));
    GMTrace.o(1875155877888L, 13971);
  }
  
  public final void F(View paramView, int paramInt)
  {
    GMTrace.i(14612552482816L, 108872);
    if (!bYo())
    {
      GMTrace.o(14612552482816L, 108872);
      return;
    }
    if ((this.sN == null) || (paramView == null))
    {
      GMTrace.o(14612552482816L, 108872);
      return;
    }
    paramInt = Math.max(paramInt, 1);
    b localb = new b();
    localb.Vl(this.sN.getResources().getQuantityString(a.i.gfU, paramInt, new Object[] { Integer.valueOf(paramInt) }));
    localb.dc(paramView);
    GMTrace.o(14612552482816L, 108872);
  }
  
  public final void a(View paramView, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(1875424313344L, 13973);
    if (!bYo())
    {
      GMTrace.o(1875424313344L, 13973);
      return;
    }
    if ((this.sN == null) || (paramView == null))
    {
      GMTrace.o(1875424313344L, 13973);
      return;
    }
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
    {
      GMTrace.o(1875424313344L, 13973);
      return;
    }
    b localb = new b();
    localb.Vl(paramString1);
    if (paramInt > 0) {
      localb.Vl(this.sN.getResources().getQuantityString(a.i.gfV, 1, new Object[] { Integer.valueOf(paramInt) }));
    }
    localb.Vl(paramString2).Vl(paramString3);
    localb.dc(paramView);
    GMTrace.o(1875424313344L, 13973);
  }
  
  public final boolean bYo()
  {
    GMTrace.i(1875290095616L, 13972);
    boolean bool1 = this.iz.isEnabled();
    boolean bool2 = this.iz.isTouchExplorationEnabled();
    if ((bool1) && (bool2))
    {
      GMTrace.o(1875290095616L, 13972);
      return true;
    }
    GMTrace.o(1875290095616L, 13972);
    return false;
  }
  
  private static final class a
  {
    public static final a vOX;
    
    static
    {
      GMTrace.i(1875692748800L, 13975);
      vOX = new a(ab.getContext());
      GMTrace.o(1875692748800L, 13975);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
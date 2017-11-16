package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Timer;

public class FaceNumberView
  extends LinearLayout
{
  public ViewGroup kZA;
  public FaceNumberItemView[] kZB;
  public int kZC;
  private Animation kZD;
  private int kZE;
  private String kZy;
  private int kZz;
  
  public FaceNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(5930812964864L, 44188);
    GMTrace.o(5930812964864L, 44188);
  }
  
  public FaceNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5930947182592L, 44189);
    this.kZy = null;
    this.kZB = null;
    this.kZC = 0;
    this.kZD = null;
    this.kZE = a.kZG;
    this.kZA = ((ViewGroup)inflate(getContext(), a.g.kQp, null));
    addView(this.kZA);
    this.kZD = AnimationUtils.loadAnimation(getContext(), a.a.aLC);
    GMTrace.o(5930947182592L, 44189);
  }
  
  private static void a(FaceNumberItemView paramFaceNumberItemView, String paramString)
  {
    GMTrace.i(5931081400320L, 44190);
    if (paramFaceNumberItemView == null)
    {
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("0"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPo);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("1"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPp);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("2"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPq);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("3"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPr);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("4"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPs);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("5"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPt);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("6"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPu);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("7"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPv);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("8"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPw);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    if (paramString.equals("9"))
    {
      paramFaceNumberItemView.setImageResource(a.d.kPx);
      GMTrace.o(5931081400320L, 44190);
      return;
    }
    paramFaceNumberItemView.setImageResource(a.d.kPy);
    GMTrace.o(5931081400320L, 44190);
  }
  
  public final void xD(String paramString)
  {
    int i = 0;
    GMTrace.i(5931215618048L, 44191);
    this.kZy = paramString;
    label60:
    FaceNumberItemView localFaceNumberItemView;
    if (this.kZy != null)
    {
      this.kZz = this.kZy.length();
      if ((this.kZB == null) || (this.kZB.length <= 0)) {
        break label265;
      }
      if (bg.nm(this.kZy)) {
        break label238;
      }
      i = 0;
      if (i >= this.kZB.length) {
        break label229;
      }
      if (this.kZz <= i) {
        break label223;
      }
      paramString = this.kZy.charAt(i);
      if (this.kZz != i + 1) {
        break label194;
      }
      localFaceNumberItemView = this.kZB[i];
      if (localFaceNumberItemView.kZn != null) {
        localFaceNumberItemView.axp();
      }
      localFaceNumberItemView.kZn = new Timer("FaceNumberItemView_karaoke", true);
      FaceNumberItemView.a locala = new FaceNumberItemView.a(localFaceNumberItemView, localFaceNumberItemView.kZv, (byte)0);
      localFaceNumberItemView.kZn.scheduleAtFixedRate(locala, 0L, FaceNumberItemView.kZo);
    }
    for (;;)
    {
      a(this.kZB[i], paramString);
      i += 1;
      break label60;
      this.kZz = 0;
      break;
      label194:
      this.kZB[i].axp();
      localFaceNumberItemView = this.kZB[i];
      localFaceNumberItemView.kZu = 30;
      localFaceNumberItemView.invalidate();
      continue;
      label223:
      paramString = "";
    }
    label229:
    GMTrace.o(5931215618048L, 44191);
    return;
    label238:
    while (i < this.kZB.length)
    {
      a(this.kZB[i], "point");
      i += 1;
    }
    label265:
    GMTrace.o(5931215618048L, 44191);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(5923833643008L, 44136);
      kZF = 1;
      kZG = 2;
      kZH = new int[] { kZF, kZG };
      GMTrace.o(5923833643008L, 44136);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceNumberView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
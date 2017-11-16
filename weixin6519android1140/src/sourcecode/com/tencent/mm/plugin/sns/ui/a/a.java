package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.MaskTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsTranslateResultView;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.TranslateCommentTextView;
import com.tencent.mm.plugin.sns.ui.ab;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.as;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.av.b;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.plugin.sns.ui.ax;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.bd;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView;
import com.tencent.mm.plugin.sns.ui.x;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.pluginsdk.ui.d.m.a;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.v.a.k;
import com.tencent.mm.vending.base.Vending;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  public boolean DEBUG;
  protected int jHw;
  protected Activity mActivity;
  protected boolean pYh;
  protected av pyk;
  public ArrayList<ao.b> qkT;
  
  public a()
  {
    GMTrace.i(8520007155712L, 63479);
    this.DEBUG = false;
    this.pYh = false;
    this.qkT = new ArrayList();
    GMTrace.o(8520007155712L, 63479);
  }
  
  private ao.b Y(String paramString, long paramLong)
  {
    GMTrace.i(8521751986176L, 63492);
    if (this.qkT.size() <= 0)
    {
      GMTrace.o(8521751986176L, 63492);
      return null;
    }
    Iterator localIterator = this.qkT.iterator();
    while (localIterator.hasNext())
    {
      ao.b localb = (ao.b)localIterator.next();
      if ((localb.id != null) && (localb.id.equals(ao.dF(paramString, String.valueOf(paramLong)))))
      {
        GMTrace.o(8521751986176L, 63492);
        return localb;
      }
    }
    GMTrace.o(8521751986176L, 63492);
    return null;
  }
  
  private static void a(View paramView, CharSequence paramCharSequence)
  {
    GMTrace.i(8521617768448L, 63491);
    if ((paramView instanceof SnsCommentPreloadTextView))
    {
      ((SnsCommentPreloadTextView)paramView).setText(paramCharSequence);
      GMTrace.o(8521617768448L, 63491);
      return;
    }
    if ((paramView instanceof TextView)) {
      ((TextView)paramView).setText(paramCharSequence);
    }
    GMTrace.o(8521617768448L, 63491);
  }
  
  private void a(c paramc, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8520275591168L, 63481);
    if (paramm.uX(32))
    {
      if ((paramm.blz() != null) && (paramm.blz().pDs == 1))
      {
        if (paramc.qla != null) {
          paramc.qla.setVisibility(8);
        }
        paramc.qle.setTag(paramc);
        paramc.qle.setOnClickListener(this.pyk.pxE.qna);
        paramc.qle.setLongClickable(true);
        this.pyk.juL.c(paramc.qle, this.pyk.pxE.qmM, this.pyk.pxE.qmv);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 8), -2);
        localLayoutParams.setMargins(0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 5), 0, 0);
        paramc.qle.setLayoutParams(localLayoutParams);
        paramc.qle.setBackgroundResource(i.e.oYl);
        if (paramc.qlx != null)
        {
          localLayoutParams = (LinearLayout.LayoutParams)paramc.qlx.getLayoutParams();
          localLayoutParams.leftMargin = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 10);
          localLayoutParams.rightMargin = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 10);
          paramc.qlx.setLayoutParams(localLayoutParams);
        }
        if (paramc.qlV)
        {
          localLayoutParams = (LinearLayout.LayoutParams)paramc.qlW.pWC.getLayoutParams();
          localLayoutParams.leftMargin = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 10);
          localLayoutParams.rightMargin = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 10);
          paramc.qlW.pWC.setLayoutParams(localLayoutParams);
        }
        if (paramc.qlc != null) {
          paramc.qlc.setVisibility(0);
        }
        if (paramc.qlb != null)
        {
          if (!com.tencent.mm.sdk.platformtools.bg.nm(paramm.blz().pDt))
          {
            paramc.qlb.setVisibility(0);
            GMTrace.o(8520275591168L, 63481);
            return;
          }
          paramc.qlb.setVisibility(8);
        }
        GMTrace.o(8520275591168L, 63481);
        return;
      }
      if (paramc.qla != null) {
        paramc.qla.setVisibility(0);
      }
      paramc.qle.setLongClickable(false);
      paramc.qle.setOnClickListener(null);
      paramm = new LinearLayout.LayoutParams(-1, -2);
      paramc.qle.setLayoutParams(paramm);
      paramc.qle.setBackgroundColor(Color.parseColor("#00ffffff"));
      if (paramc.qlx != null)
      {
        paramm = (LinearLayout.LayoutParams)paramc.qlx.getLayoutParams();
        paramm.leftMargin = 0;
        paramm.rightMargin = 0;
        paramc.qlx.setLayoutParams(paramm);
      }
      if (paramc.qlV)
      {
        paramm = (LinearLayout.LayoutParams)paramc.qlW.pWC.getLayoutParams();
        paramm.leftMargin = 0;
        paramm.rightMargin = 0;
        paramc.qlW.pWC.setLayoutParams(paramm);
      }
      if (paramc.qlc != null) {
        paramc.qlc.setVisibility(8);
      }
      if (paramc.qlb != null) {
        paramc.qlb.setVisibility(8);
      }
      GMTrace.o(8520275591168L, 63481);
      return;
    }
    if (paramc.qla != null) {
      paramc.qla.setVisibility(0);
    }
    paramc.qle.setLongClickable(false);
    paramc.qle.setOnClickListener(null);
    if (paramc.qlx != null)
    {
      paramm = (LinearLayout.LayoutParams)paramc.qlx.getLayoutParams();
      paramm.leftMargin = 0;
      paramm.rightMargin = 0;
      paramc.qlx.setLayoutParams(paramm);
    }
    if (paramc.qlV)
    {
      paramm = (LinearLayout.LayoutParams)paramc.qlW.pWC.getLayoutParams();
      paramm.leftMargin = 0;
      paramm.rightMargin = 0;
      paramc.qlW.pWC.setLayoutParams(paramm);
    }
    paramm = new LinearLayout.LayoutParams(-1, -2);
    paramc.qle.setLayoutParams(paramm);
    paramc.qle.setBackgroundColor(Color.parseColor("#00ffffff"));
    if (paramc.qlc != null) {
      paramc.qlc.setVisibility(8);
    }
    if (paramc.qlb != null) {
      paramc.qlb.setVisibility(8);
    }
    GMTrace.o(8520275591168L, 63481);
  }
  
  private boolean a(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    GMTrace.i(8521080897536L, 63487);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
    int k = localSpannableStringBuilder.length() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int[] arrayOfInt1 = new int[paramb.size()];
    int[] arrayOfInt2 = new int[paramb.size()];
    int j = 1;
    int i = 0;
    Object localObject;
    try
    {
      if (i < paramb.size())
      {
        localObject = (String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        for (;;)
        {
          arrayOfInt1[i] = localSpannableStringBuilder.length();
          arrayOfInt1[i] += ((String)localObject).length();
          localStringBuffer.append((String)localObject);
          localSpannableStringBuilder.append(com.tencent.mm.pluginsdk.ui.d.h.b(this.mActivity, (CharSequence)localObject, paramMaskTextView.getTextSize()));
          i += 1;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
        GMTrace.o(8521080897536L, 63487);
      }
    }
    catch (Exception paramMaskTextView)
    {
      w.e("MicroMsg.BaseTimeLineItem", "setLikedList  e:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(paramMaskTextView) });
    }
    for (;;)
    {
      return true;
      localObject = this.mActivity.getResources();
      if (paramInt == 11) {}
      for (i = i.e.oXJ;; i = i.e.oXU)
      {
        localObject = ((Resources)localObject).getDrawable(i);
        ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
        e locale = new e((Drawable)localObject);
        locale.xpz = ((int)((((Drawable)localObject).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.br.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
        localSpannableStringBuilder.setSpan(locale, k, k + 1, 33);
        if (paramInt != 11) {
          break label441;
        }
        paramInt = 3;
        break label435;
        while (i < arrayOfInt1.length)
        {
          localSpannableStringBuilder.setSpan(new com.tencent.mm.pluginsdk.ui.d.m((String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(0), this.pyk.pYR, paramInt), arrayOfInt1[i], arrayOfInt2[i], 33);
          i += 1;
        }
      }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.mAz = localStringBuffer.toString();
    }
    for (;;)
    {
      label435:
      i = 0;
      break;
      label441:
      paramInt = 2;
    }
  }
  
  private boolean a(List<bew> paramList, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, c paramc)
  {
    GMTrace.i(8521483550720L, 63490);
    LinearLayout localLinearLayout = paramc.qlt;
    int n = localLinearLayout.getChildCount();
    int j = paramb.size();
    int i;
    if (n > j)
    {
      i = j;
      while (i < n)
      {
        localObject1 = localLinearLayout.getChildAt(j);
        localLinearLayout.removeViewAt(j);
        if ((localObject1 instanceof SnsCommentPreloadTextView)) {
          this.pyk.a((SnsCommentPreloadTextView)localObject1);
        }
        i += 1;
      }
    }
    if (paramb.size() == 0)
    {
      localLinearLayout.setVisibility(8);
      GMTrace.o(8521483550720L, 63490);
      return false;
    }
    localLinearLayout.setVisibility(0);
    final Object localObject1 = this.pyk.bpE();
    if ((localObject1 instanceof ax)) {}
    for (ay localay = (ay)((ax)localObject1).qhd.get(paramc.position);; localay = null)
    {
      if (this.DEBUG) {
        w.d("MicroMsg.BaseTimeLineItem", "debug:setCommentList position " + paramc.position + " commentCount: " + j);
      }
      int k = 0;
      j = 0;
      Object localObject3;
      ao.b localb;
      label437:
      int m;
      Object localObject2;
      TranslateCommentTextView localTranslateCommentTextView;
      label652:
      String str4;
      String str5;
      if (j < paramb.size())
      {
        localObject1 = (com.tencent.mm.vending.j.a)paramb.get(j);
        long l = ((Long)((com.tencent.mm.vending.j.a)localObject1).get(0)).longValue();
        String str1 = (String)((com.tencent.mm.vending.j.a)localObject1).get(1);
        String str2 = (String)((com.tencent.mm.vending.j.a)localObject1).get(2);
        String str3 = (String)((com.tencent.mm.vending.j.a)localObject1).get(3);
        localObject3 = (CharSequence)((com.tencent.mm.vending.j.a)localObject1).get(4);
        bew localbew = (bew)paramList.get(j);
        localb = Y(paramc.eUg, l);
        if ((localb != null) && (localb.gsF)) {
          ao.bO(localb.id, 2);
        }
        if (k >= n) {
          if ((localb == null) || (localb.gsF))
          {
            localObject1 = this.pyk.bpA();
            ((SnsCommentPreloadTextView)localObject1).J(14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
            if (this.pyk.qgE == -1) {
              this.pyk.qgE = this.mActivity.getResources().getColor(i.c.oXc);
            }
            ((SnsCommentPreloadTextView)localObject1).setTextColor(this.pyk.qgE);
            ((SnsCommentPreloadTextView)localObject1).xS();
            m = 1;
            localObject2 = localObject1;
          }
        }
        for (;;)
        {
          if (localb != null)
          {
            localObject1 = localObject2;
            if (!(localObject2 instanceof TranslateCommentTextView))
            {
              localLinearLayout.removeView((View)localObject2);
              localObject1 = new TranslateCommentTextView(this.mActivity);
              localLinearLayout.addView((View)localObject1, k);
              ((TranslateCommentTextView)localObject1).pZW.ar(14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).qkt.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
            }
            localTranslateCommentTextView = (TranslateCommentTextView)localObject1;
            ((View)localObject1).setOnTouchListener(null);
            a(localTranslateCommentTextView.qkt, (CharSequence)localObject3);
            if (!localb.gpJ)
            {
              localTranslateCommentTextView.qkt.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(localTranslateCommentTextView.getContext()));
              localTranslateCommentTextView.pZW.vA(2);
              localTranslateCommentTextView.pZW.setVisibility(0);
              i = 1;
              ((View)localObject1).setBackgroundResource(i.e.oYw);
              if (k <= 0) {
                break label1227;
              }
              if (i == 0) {
                break label1201;
              }
              ((View)localObject1).setPadding(0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 7));
              if (i != 0)
              {
                localObject2 = (TranslateCommentTextView)localObject1;
                i = (int)this.mActivity.getResources().getDimension(i.d.aQN);
                ((TranslateCommentTextView)localObject2).pZW.qiu.setPadding(0, 0, i, 0);
              }
              ((View)localObject1).setOnLongClickListener(new View.OnLongClickListener()
              {
                public final boolean onLongClick(View paramAnonymousView)
                {
                  GMTrace.i(16145050501120L, 120290);
                  int[] arrayOfInt = new int[2];
                  if ((paramAnonymousView.getTag(i.f.cie) instanceof int[])) {}
                  for (paramAnonymousView = (int[])paramAnonymousView.getTag(i.f.cie);; paramAnonymousView = arrayOfInt)
                  {
                    a.this.pyk.juL.a(localObject1, a.this.pyk.pxE.qmI, a.this.pyk.pxE.qmv, paramAnonymousView[0], paramAnonymousView[1]);
                    GMTrace.o(16145050501120L, 120290);
                    return true;
                  }
                }
              });
              ((View)localObject1).setOnClickListener(new com.tencent.mm.plugin.sns.ui.j.a(this.pyk.qgA, localbew, str2, str3, paramc));
              if (localay != null) {
                ((View)localObject1).setTag(new com.tencent.mm.plugin.sns.ui.m(localay.qhr, localbew, str1, str3, (View)localObject1, 1));
              }
              if (m != 0) {
                localLinearLayout.addView((View)localObject1);
              }
              k += 1;
              j += 1;
              break;
              localObject1 = new TranslateCommentTextView(this.mActivity);
              ((TranslateCommentTextView)localObject1).pZW.ar(14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).qkt.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
              break label437;
              localObject2 = localLinearLayout.getChildAt(k);
              m = 0;
              continue;
            }
            if (!localb.gsF)
            {
              str4 = localb.result;
              str5 = localb.gxw;
              String str6 = localTranslateCommentTextView.qkt.getText().toString();
              if (!com.tencent.mm.sdk.platformtools.bg.nm(str6))
              {
                localObject2 = str6.split(":");
                if (localObject2.length <= 2) {
                  break label1282;
                }
                localObject3 = new String[2];
                localObject3[0] = localObject2[0];
                localObject3[1] = str6.substring(localObject3[0].length() + 1);
                localObject2 = localObject3;
              }
            }
          }
        }
      }
      label1068:
      label1201:
      label1227:
      label1282:
      for (;;)
      {
        if (localObject2.length == 2)
        {
          if (com.tencent.mm.sdk.platformtools.bg.nm(str4)) {
            break label1068;
          }
          localTranslateCommentTextView.pZW.a(localb, 2, localObject2[0] + ": " + str4, str5, localb.pvS);
        }
        for (;;)
        {
          localTranslateCommentTextView.pZW.setVisibility(0);
          localTranslateCommentTextView.qkt.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(localTranslateCommentTextView.getContext()));
          i = 1;
          break;
          localTranslateCommentTextView.pZW.a(localb, 2, null, str5, localb.pvS);
        }
        localTranslateCommentTextView.pZW.setVisibility(8);
        i = 1;
        break;
        localObject1 = localObject2;
        if (m == 0)
        {
          localObject1 = localObject2;
          if ((localObject2 instanceof TranslateCommentTextView))
          {
            localLinearLayout.removeView((View)localObject2);
            localObject1 = this.pyk.bpA();
            localLinearLayout.addView((View)localObject1, k);
            ((SnsCommentPreloadTextView)localObject1).J(14.0F * com.tencent.mm.br.a.dZ(((View)localObject1).getContext()));
          }
        }
        ((View)localObject1).setOnTouchListener(new k(this.mActivity));
        a((View)localObject1, (CharSequence)localObject3);
        i = 0;
        break;
        ((View)localObject1).setPadding(0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 3));
        break label652;
        if (i != 0)
        {
          ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 7));
          break label652;
        }
        ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.br.a.fromDPToPix(this.mActivity, 3));
        break label652;
        GMTrace.o(8521483550720L, 63490);
        return true;
      }
    }
  }
  
  private void b(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    GMTrace.i(8521215115264L, 63488);
    if (paramb.size() == 0)
    {
      paramMaskTextView.setVisibility(8);
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    paramMaskTextView.setVisibility(0);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
    int k = localSpannableStringBuilder.length() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int[] arrayOfInt1 = new int[paramb.size()];
    int[] arrayOfInt2 = new int[paramb.size()];
    int j = 1;
    int i = 0;
    Object localObject;
    try
    {
      if (i < paramb.size())
      {
        localObject = (String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        for (;;)
        {
          arrayOfInt1[i] = localSpannableStringBuilder.length();
          arrayOfInt1[i] += ((String)localObject).length();
          localStringBuffer.append((String)localObject);
          localSpannableStringBuilder.append(com.tencent.mm.pluginsdk.ui.d.h.b(this.mActivity, (CharSequence)localObject, paramMaskTextView.getTextSize()));
          i += 1;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
      }
      localObject = this.mActivity.getResources().getDrawable(i.i.phg);
    }
    catch (Exception paramMaskTextView)
    {
      w.e("MicroMsg.BaseTimeLineItem", "setReward error  e:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(paramMaskTextView) });
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
    e locale = new e((Drawable)localObject);
    locale.xpz = ((int)((((Drawable)localObject).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.br.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
    localSpannableStringBuilder.setSpan(locale, k, k + 1, 33);
    if (paramInt == 11)
    {
      paramInt = 3;
      break label447;
      while (i < arrayOfInt1.length)
      {
        localSpannableStringBuilder.setSpan(new com.tencent.mm.pluginsdk.ui.d.m((String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(0), this.pyk.pYR, paramInt), arrayOfInt1[i], arrayOfInt2[i], 33);
        i += 1;
      }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.mAz = localStringBuffer.toString();
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    for (;;)
    {
      label447:
      i = 0;
      break;
      paramInt = 2;
    }
  }
  
  public static void e(c paramc)
  {
    GMTrace.i(8520812462080L, 63485);
    if ((paramc != null) && (paramc.qld != null)) {
      paramc.qld.setVisibility(8);
    }
    GMTrace.o(8520812462080L, 63485);
  }
  
  public final View a(Activity paramActivity, c paramc, int paramInt, av paramav, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8520409808896L, 63482);
    this.mActivity = paramActivity;
    this.jHw = paramInt;
    this.pyk = paramav;
    paramc.eUg = paramm.blE();
    Object localObject;
    View localView;
    label151:
    int i;
    int j;
    int k;
    switch (paramInt)
    {
    default: 
      localObject = "R.layout.sns_media_sub_item2";
      localView = com.tencent.mm.kiss.a.b.xK().a(this.mActivity, (String)localObject, i.g.pgy);
      paramc.qmg = ((String)localObject);
      localObject = localView.findViewById(i.f.paR);
      if ((localObject instanceof ViewStub))
      {
        paramc.qlf = ((ViewStub)localObject);
        w.i("MicroMsg.BaseTimeLineItem", "create new item  " + paramInt + "  " + localView.hashCode());
        paramc.qlZ = localView.findViewById(i.f.peb);
        paramc.jHw = paramInt;
        paramc.hqG = ((MaskImageButton)localView.findViewById(i.f.oZb));
        paramc.hqG.setOnClickListener(paramav.pxE.qmw);
        paramc.hqG.setOnLongClickListener(paramav.pxE.qmx);
        paramc.hqG.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(15967346229248L, 118966);
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              int i = (int)paramAnonymousMotionEvent.getRawX();
              int j = (int)paramAnonymousMotionEvent.getRawY();
              paramAnonymousView.setTag(i.f.cie, new int[] { i, j });
            }
            GMTrace.o(15967346229248L, 118966);
            return false;
          }
        });
        paramc.qkX = ((AsyncTextView)localView.findViewById(i.f.bQX));
        paramc.qkY = ((ImageView)localView.findViewById(i.f.peu));
        paramc.qkX.setOnTouchListener(new ab());
        paramc.qkZ = ((ViewGroup)localView.findViewById(i.f.pbv));
        paramc.qla = ((AsyncNormalTextView)localView.findViewById(i.f.pat));
        paramc.qla.e(paramav.qgL);
        paramc.qlc = ((TextView)localView.findViewById(i.f.pas));
        paramc.qlc.setClickable(false);
        paramc.qlc.setLongClickable(false);
        paramc.qlb = ((TextView)localView.findViewById(i.f.par));
        paramc.qlb.setClickable(false);
        paramc.qlb.setLongClickable(false);
        paramc.qmh = localView.findViewById(i.f.paa);
        paramc.qmi = ((Button)localView.findViewById(i.f.pab));
        paramc.qmj = ((Button)localView.findViewById(i.f.pac));
        paramc.qmi.setOnClickListener(paramav.pxE.qmY);
        paramc.qmj.setOnClickListener(paramav.pxE.qmZ);
        paramc.qle = ((LinearLayout)localView.findViewById(i.f.paS));
        if (paramm.uX(32))
        {
          localObject = paramm.blz();
          if ((localObject == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject).pDh != 1)) {
            break label1362;
          }
          paramInt = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
          i = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50);
          j = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50);
          k = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
          int m = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
          paramc.qla.setContentWidth(paramInt - i - j - k - m);
          paramc.qla.bmG();
        }
      }
      break;
    }
    for (;;)
    {
      paramc.qle.setTag(paramc);
      paramc.qle.setOnClickListener(paramav.pxE.qna);
      localObject = localView.findViewById(i.f.bti);
      paramav.juL.c((View)localObject, paramav.pxE.qmy, paramav.pxE.qmv);
      localObject = (TextView)localView.findViewById(i.f.paw);
      paramav.juL.c((View)localObject, paramav.pxE.qmy, paramav.pxE.qmv);
      paramc.qld = ((SnsTranslateResultView)localView.findViewById(i.f.peg));
      paramc.qld.setVisibility(8);
      paramc.qld.qiu.setPadding(0, 0, (int)this.mActivity.getResources().getDimension(i.d.aQN), 0);
      paramc.qld.oyB.setBackgroundResource(i.e.oYo);
      paramav.juL.c(paramc.qld.oyB, paramav.pxE.qmy, paramav.pxE.qmv);
      paramc.qlw = ((LinearLayout)localView.findViewById(i.f.pag));
      paramc.qll = ((TextView)localView.findViewById(i.f.peE));
      paramc.kHx = ((TextView)localView.findViewById(i.f.oZP));
      paramc.qlm = ((AsyncTextView)localView.findViewById(i.f.oYZ));
      paramc.qln = ((AsyncTextView)localView.findViewById(i.f.oYY));
      paramc.qeo = ((TextView)localView.findViewById(i.f.oZa));
      paramc.poY = new bf(localView);
      paramc.poY.a(paramav.pxE.qmF, paramav.pxE.qmU);
      paramc.pSP = ((TextView)localView.findViewById(i.f.oZr));
      paramc.pSP.setText(paramActivity.getString(i.j.cSt));
      paramc.pSP.setOnClickListener(paramav.pxE.qmz);
      paramc.qlm.setOnClickListener(paramav.pxE.qmV);
      paramc.qln.setOnClickListener(paramav.pxE.qmW);
      paramc.qeo.setOnClickListener(paramav.pxE.qmR);
      paramc.qlp = localView.findViewById(i.f.oZt);
      paramc.qlp.setOnClickListener(paramav.pxE.qmE);
      paramc.qlo = ((TextView)localView.findViewById(i.f.oZs));
      paramc.qlq = ((ImageView)localView.findViewById(i.f.oZQ));
      paramc.qlz = ((ViewStub)localView.findViewById(i.f.oZn));
      paramc.pOm = ((LinearLayout)localView.findViewById(i.f.oZL));
      paramc.qmb = ((ViewStub)localView.findViewById(i.f.oZu));
      paramc.qlB = ((ViewStub)localView.findViewById(i.f.pdJ));
      paramc.qlh = ((TextView)localView.findViewById(i.f.paK));
      paramc.qlh.setOnClickListener(paramav.pxE.qmA);
      paramc.qmf = ((TextView)localView.findViewById(i.f.paO));
      paramc.lFh = localView;
      if (this.pYh)
      {
        com.tencent.mm.plugin.sns.abtest.c.b(localView, paramc);
        com.tencent.mm.plugin.sns.abtest.a.a(localView, paramc);
        ae.biU();
        com.tencent.mm.plugin.sns.f.c.c(localView, paramc);
      }
      d(paramc);
      localView.setTag(paramc);
      a(paramc, paramm);
      GMTrace.o(8520409808896L, 63482);
      return localView;
      localObject = "R.layout.sns_timeline_item_photo_one3";
      break;
      localObject = "R.layout.sns_timeline_imagesline_one";
      break;
      localObject = "R.layout.sns_timeline_imagesline1";
      break;
      localObject = "R.layout.sns_timeline_imagesline2";
      break;
      localObject = "R.layout.sns_timeline_imagesline3";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sight_item";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_hb_reward_item";
      break;
      paramc.qlf = null;
      break label151;
      label1362:
      if ((localObject != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject).pDh == 2))
      {
        paramInt = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
        i = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50);
        j = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
        k = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
        paramc.qla.setContentWidth(paramInt - i - j - k);
        paramc.qla.bmG();
      }
    }
  }
  
  public final void a(c paramc, int paramInt, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8521349332992L, 63489);
    paramm = paramm.blD();
    a(paramc, paramInt, (ay)this.pyk.bpE().bnz().get(Integer.valueOf(paramInt)), paramm, paramc.jHw, this.pyk);
    GMTrace.o(8521349332992L, 63489);
  }
  
  public final void a(c paramc, int paramInt1, com.tencent.mm.plugin.sns.storage.m paramm, biz parambiz, int paramInt2, av paramav)
  {
    GMTrace.i(8520678244352L, 63484);
    Object localObject3 = (ay)paramav.bpE().bnz().get(Integer.valueOf(paramInt1));
    a(paramc, paramm);
    this.jHw = paramInt2;
    this.pyk = paramav;
    if (this.pYh) {
      ax.C(paramm);
    }
    if (paramm.uX(32)) {
      w.i("MicroMsg.BaseTimeLineItem", "the ad sns id is " + com.tencent.mm.plugin.sns.data.i.du(paramm.field_snsId) + " for susan");
    }
    paramc.qkV = ((ay)localObject3).qhs;
    paramc.lLO = false;
    paramc.position = paramInt1;
    paramc.eUg = ((ay)localObject3).qhr;
    paramc.eEM = ((ay)localObject3).pSl;
    paramc.qkW = ((ay)localObject3).qhw;
    paramc.qlq.setOnClickListener(paramav.qgK);
    paramc.qlX = parambiz;
    bfh localbfh = ((ay)localObject3).oWK;
    paramc.pmB = localbfh;
    Object localObject1 = paramav.qgA.pOZ.pvl;
    Object localObject2;
    if (paramm != null)
    {
      localObject2 = paramm.blY();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBt.add(localObject2);
      if (paramm.uX(32)) {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pBy.add(localObject2);
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBz.add(paramm.field_userName);
    }
    label634:
    Object localObject4;
    Object localObject5;
    boolean bool1;
    Object localObject6;
    label793:
    label853:
    label906:
    label932:
    int k;
    int m;
    int n;
    int i1;
    switch (paramm.field_type)
    {
    default: 
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBE.add(localObject2);
      if (paramInt1 < ((com.tencent.mm.plugin.sns.h.b)localObject1).pBr)
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pBr = paramInt1;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pzX = com.tencent.mm.plugin.sns.data.i.g(paramm);
      }
      if (paramInt1 > ((com.tencent.mm.plugin.sns.h.b)localObject1).pBs)
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pBs = paramInt1;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pzY = com.tencent.mm.plugin.sns.data.i.g(paramm);
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAd = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBu.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAe = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBv.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAf = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBw.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAh = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBx.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAg = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBy.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAi = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBC.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAq = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBD.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).juE = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBz.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAb = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBA.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAc = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBB.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pAp = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBE.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pzL = ((com.tencent.mm.plugin.sns.h.b)localObject1).pBt.size();
      localObject1 = ((ay)localObject3).iAx;
      if (localObject1 != null)
      {
        paramc.qlY = ((ay)localObject3).qhq;
        if (((ay)localObject3).qhH)
        {
          w.i("MicroMsg.BaseTimeLineItem", "getContact %s", new Object[] { localObject1 });
          if (com.tencent.mm.pluginsdk.ui.a.b.bKI().oT() != null) {
            paramc.hqG.setImageBitmap(com.tencent.mm.pluginsdk.ui.a.b.bKI().oT());
          }
          ak.a.gmX.a((String)localObject1, "", new av.b(paramav.bpE(), paramInt1));
          paramc.hqG.setTag(localObject1);
          ((MaskImageButton)paramc.hqG).xih = ((ay)localObject3).pSl;
          localObject2 = paramc.qkX;
          localObject4 = ((ay)localObject3).qhG;
          localObject5 = paramav.pYR;
          bool1 = ((ay)localObject3).pOL;
          localObject6 = ((ay)localObject3).pSl;
          boolean bool2 = ((ay)localObject3).pOL;
          ((AsyncTextView)localObject2).userName = ((String)localObject1);
          ((AsyncTextView)localObject2).pOK = ((String)localObject4);
          ((AsyncTextView)localObject2).jHw = paramInt2;
          ((AsyncTextView)localObject2).pOL = bool1;
          ((AsyncTextView)localObject2).pOM = ((String)localObject6);
          ((AsyncTextView)localObject2).pON = ((m.a)localObject5);
          ((AsyncTextView)localObject2).pOO = bool2;
          ((AsyncTextView)localObject2).run();
        }
      }
      else
      {
        paramc.qkY.setVisibility(8);
        if (!((ay)localObject3).pOL) {
          break label2957;
        }
        paramc.poX = true;
        paramc.lLO = ((ay)localObject3).qhx;
        paramc.hTy = ((ay)localObject3).qhy;
        paramc.qmh.setVisibility(8);
        if ((paramc == null) || (!paramm.uX(32)) || (paramm.blz() == null) || (paramm.blz().pDs != 1)) {
          break label3126;
        }
        if (!com.tencent.mm.sdk.platformtools.bg.nm(paramm.blz().pDu)) {
          break label2972;
        }
        localObject1 = parambiz.uTZ;
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
          break label2984;
        }
        paramc.qlc.setText((String)localObject1 + " ");
        com.tencent.mm.pluginsdk.ui.d.h.e(paramc.qlc, 2);
        paramc.qlc.setVisibility(0);
        localObject1 = paramm.blz().pDt;
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
          break label2996;
        }
        paramc.qlb.setVisibility(8);
        int i;
        if ((paramm.blz().bkf()) || (paramm.blz().bkg()))
        {
          paramc.qmh.setVisibility(0);
          k = i.e.oYn;
          m = Color.parseColor("#cdcdcd");
          n = Color.parseColor("#ffffff");
          int j = 1;
          i = j;
          if (paramm.blz().bkg())
          {
            i1 = u.dP(paramm.blz().pDw.pDA, paramm.bmi());
            i = j;
            if (i1 > 0)
            {
              i = j;
              if (i1 <= 2)
              {
                if (i1 != 1) {
                  break label3044;
                }
                paramc.qmj.setBackgroundColor(n);
                paramc.qmj.setTextColor(m);
                paramc.qmj.setText(paramm.blz().pDw.uI(1));
                paramc.qmi.setBackgroundResource(k);
                paramc.qmi.setTextColor(-16777216);
                paramc.qmi.setText(paramm.blz().pDw.uH(0));
                label1115:
                i = 0;
              }
            }
          }
          if (i != 0)
          {
            paramc.qmi.setTextColor(-16777216);
            paramc.qmi.setBackgroundResource(k);
            paramc.qmj.setTextColor(-16777216);
            paramc.qmj.setBackgroundResource(k);
            paramc.qmi.setText(paramm.blz().bka());
            paramc.qmj.setText(paramm.blz().bkb());
          }
        }
        label1189:
        paramc.qlo.setOnTouchListener(new ab());
        a(paramc, paramInt1, (ay)localObject3, parambiz, paramInt2, paramav);
        paramav.qgC.put(Integer.valueOf(paramInt1), new WeakReference(paramc.lFh));
        if (paramc.lFh.getBackground() == null)
        {
          paramc.lFh.setBackgroundResource(i.e.aVO);
          paramInt1 = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
          i = com.tencent.mm.br.a.fromDPToPix(this.mActivity, 8);
          paramc.lFh.setPadding(paramInt1, paramInt1, paramInt1, i);
        }
        paramc.kHx.setText(((ay)localObject3).qhz);
        paramc.qlm.setVisibility(8);
        paramc.qln.setVisibility(8);
        if (((ay)localObject3).pOL)
        {
          localObject2 = ((ay)localObject3).qhA;
          paramc.qlm.setTag(((ay)localObject3).pSl);
          if (((ay)localObject3).qhA.pCl != com.tencent.mm.plugin.sns.storage.a.pBX) {
            break label3208;
          }
          if (com.tencent.mm.sdk.platformtools.bg.nm(((ay)localObject3).qhD)) {
            break label3196;
          }
          paramc.qlm.setText(((ay)localObject3).qhD);
          paramc.qlm.setVisibility(0);
          label1396:
          if ((paramc.qlm.getVisibility() != 8) && (com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject2).pCn)))
          {
            paramc.qlm.setTextColor(this.mActivity.getResources().getColor(i.c.oXl));
            paramc.qlm.setOnClickListener(null);
          }
          if (paramm.blD().uUc.ueX != 4) {
            break label3517;
          }
          paramc.qln.setTag(paramc);
          paramc.qln.setVisibility(0);
          paramc.qln.setText(String.format("%s%s%s", new Object[] { this.mActivity.getResources().getString(i.j.piu), ((ay)localObject3).qhG, this.mActivity.getResources().getString(i.j.piv) }));
        }
        label1534:
        if (!((ay)localObject3).qhJ) {
          break label3529;
        }
        localObject1 = paramav.ezR.getString(i.j.phW, new Object[] { Integer.valueOf(((ay)localObject3).qhK) });
        paramc.qmf.setText((CharSequence)localObject1);
        paramc.qmf.setVisibility(0);
        label1587:
        paramc.qeo.setTag(((ay)localObject3).pSl);
        if (com.tencent.mm.sdk.platformtools.bg.nm(((ay)localObject3).qhM)) {
          break label3548;
        }
        paramc.qeo.setVisibility(0);
        paramc.qeo.setText(((ay)localObject3).qhM);
        paramc.qeo.setClickable(((ay)localObject3).qhN);
        localObject1 = paramc.qeo;
        if (!((ay)localObject3).qhN) {
          break label3541;
        }
        paramInt1 = -11048043;
        label1660:
        ((TextView)localObject1).setTextColor(paramInt1);
        label1666:
        paramc.qlo.setTextColor(this.mActivity.getResources().getColor(i.c.aPa));
        if (!((ay)localObject3).qhO) {
          break label3560;
        }
        paramc.qlo.setVisibility(0);
        localObject2 = this.mActivity.getString(i.j.piL) + ((ay)localObject3).mAppName;
        localObject1 = localObject2;
        if (((String)localObject2).length() > 10) {
          localObject1 = ((String)localObject2).substring(0, 10) + "...";
        }
        localObject1 = new SpannableString((CharSequence)localObject1);
        ((SpannableString)localObject1).setSpan(new b(), 0, ((SpannableString)localObject1).length(), 33);
        paramc.qlo.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
        if ((!((ay)localObject3).qhQ) && (!"wx7fa037cc7dfabad5".equals(parambiz.uUb.mmR)))
        {
          paramc.qlo.setTextColor(this.mActivity.getResources().getColor(i.c.oXl));
          paramc.qlo.setOnTouchListener(null);
        }
        paramc.qlo.setTag(parambiz);
        label1884:
        if (!((ay)localObject3).qhI) {
          break label3861;
        }
        paramc.pSP.setVisibility(0);
        paramc.pSP.setTag(((ay)localObject3).pSl);
        label1912:
        paramc.qlq.setTag(paramc);
        if (!((ay)localObject3).qhU) {
          break label3960;
        }
        if (!paramc.qlF)
        {
          paramc.qlu = ((LinearLayout)paramc.qlB.inflate());
          paramc.qlv = paramc.lFh.findViewById(i.f.pbA);
          paramc.qlF = true;
          paramc.qlv.setTag(((ay)localObject3).pSl);
          paramc.pIu = ((TextView)paramc.qlu.findViewById(i.f.pbA));
        }
        paramc.qlB.setVisibility(0);
        paramc.qlv.setOnClickListener(paramav.pxE.qmD);
        switch (((ay)localObject3).qhV)
        {
        default: 
          paramc.pIu.setText(i.j.pkq);
          paramc.qlv.setClickable(true);
          paramc.qlv.setEnabled(true);
          label2086:
          parambiz = paramm.blQ();
          if ((parambiz != null) && (!com.tencent.mm.sdk.platformtools.bg.nm(parambiz.uDB))) {
            paramc.pIu.setText(parambiz.uDB);
          }
          label2120:
          if (((ay)localObject3).qhW)
          {
            paramc.qlp.setVisibility(0);
            paramc.qlp.setTag(((ay)localObject3).pSl);
            label2148:
            if (!((ay)localObject3).qhX) {
              break label4082;
            }
            if (com.tencent.mm.sdk.platformtools.bg.nm(((ay)localObject3).qhY)) {
              break label4021;
            }
            paramc.qll.setVisibility(0);
            if (paramInt2 != 7) {
              break label3991;
            }
            parambiz = String.format(this.mActivity.getString(i.j.pkV), new Object[] { ((ay)localObject3).qhY });
            label2209:
            parambiz = com.tencent.mm.pluginsdk.ui.d.h.b(this.mActivity, parambiz, paramc.qll.getTextSize());
            paramc.qll.setText(parambiz);
            label2236:
            if (!((ay)localObject3).qia) {
              break label4094;
            }
            if (paramc.qmc == null)
            {
              paramc.qmc = paramc.qmb.inflate();
              paramc.pqx = ((TextView)paramc.qmc.findViewById(i.f.oZv));
              paramc.qmd = ((MaskTextView)paramc.qmc.findViewById(i.f.oZw));
              paramc.qmd.setOnTouchListener(new ab());
            }
            paramc.qmc.setVisibility(0);
            b(paramc.qmd, ((ay)localObject3).qid, paramInt2);
            parambiz = this.mActivity.getString(i.j.pjX, new Object[] { Integer.valueOf(((ay)localObject3).qib), com.tencent.mm.sdk.platformtools.bg.r(((ay)localObject3).qic / 100.0D) });
            paramc.pqx.setText(parambiz);
            paramc.qmc.setTag(paramm);
            paramc.qmc.setOnClickListener(paramav.pxE.qmH);
            label2407:
            if (((((ay)localObject3).qie != null) && (((ay)localObject3).qie.size() != 0)) || ((((ay)localObject3).qif != null) && (((ay)localObject3).qif.size() != 0))) {
              break label4132;
            }
            if (paramc.pOm == null) {
              break label4113;
            }
            paramc.pOm.setVisibility(8);
            label2461:
            if (!((ay)localObject3).qig) {
              break label4425;
            }
            paramc.qlh.setTag(((ay)localObject3).pSl);
            paramc.qlh.setText(((ay)localObject3).qih);
            paramc.qlh.setVisibility(0);
            label2501:
            if (!((ay)localObject3).pOL) {
              break label4442;
            }
            w.i("MicroMsg.BaseTimeLineItem", "adatag " + ((ay)localObject3).qhC);
            paramc.poY.r(Long.valueOf(((ay)localObject3).qhs), new com.tencent.mm.plugin.sns.data.b(paramc.poY, paramc.position, ((ay)localObject3).pSl, ((ay)localObject3).qhs));
            paramc.poY.a(((ay)localObject3).qhB, ((ay)localObject3).qhA);
            paramc.poY.setVisibility(0);
            if ((paramc.qeo != null) && (paramc.qeo.getVisibility() == 0))
            {
              if (paramc.poY.qjC.getVisibility() != 0) {
                break label4437;
              }
              paramInt1 = 1;
              label2633:
              if (paramInt1 != 0)
              {
                paramm = (LinearLayout.LayoutParams)paramc.qeo.getLayoutParams();
                paramm.setMargins(paramm.leftMargin, BackwardSupportUtil.b.a(this.mActivity, 0.0F), paramm.rightMargin, paramm.bottomMargin);
                paramc.qeo.setLayoutParams(paramm);
              }
            }
          }
          break;
        }
      }
      break;
    }
    for (;;)
    {
      if (this.pYh) {
        ae.biU().a(this.mActivity, localbfh, paramc);
      }
      paramm = new as(((ay)localObject3).qhr, ((ay)localObject3).pSl, false, true, 1);
      paramc.qld.oyB.setTag(paramm);
      paramm = com.tencent.mm.ui.a.a.a.vOX;
      parambiz = paramc.lFh;
      paramav = paramc.qkX;
      localObject3 = paramc.kHx;
      localObject1 = paramc.qla.content;
      localObject2 = paramc.qlj;
      bool1 = paramc.qlV;
      if (!paramm.bYo()) {
        break label4530;
      }
      if ((paramm.sN != null) && (parambiz != null) && (paramav != null) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) && (localObject3 != null)) {
        break label4454;
      }
      GMTrace.o(8520678244352L, 63484);
      return;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBv.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBu.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBx.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBw.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBC.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBD.add(localObject2);
      break;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(parambiz.uUd))
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pBA.add(localObject2);
        break;
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).pBB.add(localObject2);
      break;
      com.tencent.mm.pluginsdk.ui.a.b.a(paramc.hqG, (String)localObject1);
      break label634;
      label2957:
      paramc.poX = false;
      paramc.hTy = "";
      break label793;
      label2972:
      localObject1 = paramm.blz().pDu;
      break label853;
      label2984:
      paramc.qlc.setVisibility(8);
      break label906;
      label2996:
      paramc.qlb.setText((String)localObject1 + " ");
      com.tencent.mm.pluginsdk.ui.d.h.e(paramc.qlb, 2);
      paramc.qlb.setVisibility(0);
      break label932;
      label3044:
      if (i1 != 2) {
        break label1115;
      }
      paramc.qmi.setBackgroundColor(n);
      paramc.qmi.setTextColor(m);
      paramc.qmi.setText(paramm.blz().pDw.uI(0));
      paramc.qmj.setBackgroundResource(k);
      paramc.qmj.setTextColor(-16777216);
      paramc.qmj.setText(paramm.blz().pDw.uH(1));
      break label1115;
      label3126:
      localObject1 = paramc.qla;
      localObject2 = ((ay)localObject3).qht;
      ((AsyncNormalTextView)localObject1).pOI = ((ay)localObject3).qhu;
      ((AsyncNormalTextView)localObject1).content = ((String)localObject2);
      ((AsyncNormalTextView)localObject1).pyk = paramav;
      ((AsyncNormalTextView)localObject1).pOJ = ((ay)localObject3);
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
        ((AsyncNormalTextView)localObject1).setVisibility(8);
      }
      paramc.qla.c(paramc);
      break label1189;
      label3196:
      paramc.qlm.setVisibility(8);
      break label1396;
      label3208:
      if (((com.tencent.mm.plugin.sns.storage.a)localObject2).pCl != com.tencent.mm.plugin.sns.storage.a.pBY) {
        break label1396;
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(((ay)localObject3).qhE))
      {
        localObject1 = ((ay)localObject3).qhF;
        localObject4 = ((ay)localObject3).qhE;
        localObject5 = this.mActivity;
        paramc.qlm.getTextSize();
        localObject5 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d((Context)localObject5, (CharSequence)localObject4, 1));
        ((com.tencent.mm.pluginsdk.ui.d.i)localObject5).f(null, (CharSequence)localObject4);
        localObject4 = paramc.qlm.getPaint();
        float f = Layout.getDesiredWidth((CharSequence)localObject5, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject5).length(), (TextPaint)localObject4);
        if (com.tencent.mm.br.a.Y(this.mActivity, (int)f) > paramc.pYZ)
        {
          do
          {
            if (((String)localObject1).length() <= 1) {
              break;
            }
            localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 2);
            localObject5 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject2).pCm, new Object[] { (String)localObject1 + "..." });
            localObject6 = this.mActivity;
            paramc.qlm.getTextSize();
            localObject6 = new com.tencent.mm.pluginsdk.ui.d.i(com.tencent.mm.pluginsdk.ui.d.h.d((Context)localObject6, (CharSequence)localObject5, 1));
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject6).f(null, (CharSequence)localObject5);
            f = Layout.getDesiredWidth((CharSequence)localObject6, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject6).length(), (TextPaint)localObject4);
            paramInt1 = com.tencent.mm.br.a.Y(this.mActivity, (int)f);
            paramc.qlm.setText((CharSequence)localObject6, TextView.BufferType.SPANNABLE);
            paramc.qlm.setVisibility(0);
          } while (paramInt1 > paramc.pYZ);
          break label1396;
        }
        paramc.qlm.setText((CharSequence)localObject5, TextView.BufferType.SPANNABLE);
        paramc.qlm.setVisibility(0);
        break label1396;
      }
      paramc.qlm.setVisibility(8);
      break label1396;
      label3517:
      paramc.qln.setVisibility(8);
      break label1534;
      label3529:
      paramc.qmf.setVisibility(8);
      break label1587;
      label3541:
      paramInt1 = -9211021;
      break label1660;
      label3548:
      paramc.qeo.setVisibility(8);
      break label1666;
      label3560:
      if (((ay)localObject3).qhP)
      {
        paramc.qlo.setVisibility(0);
        parambiz = new SpannableString(((ay)localObject3).qhS);
        parambiz.setSpan(new d(), 0, parambiz.length(), 33);
        paramc.qlo.setText(parambiz, TextView.BufferType.SPANNABLE);
        paramc.qlo.setTag(new bd(((ay)localObject3).qhR, ((ay)localObject3).qhS));
        break label1884;
      }
      if (((ay)localObject3).qhT)
      {
        paramc.qlo.setVisibility(0);
        localObject1 = this.mActivity.getString(i.j.phL);
        localObject2 = (String)localObject1 + ((ay)localObject3).mAppName;
        localObject4 = new SpannableString((CharSequence)localObject2);
        ((SpannableString)localObject4).setSpan(new ForegroundColorSpan(this.mActivity.getResources().getColor(i.c.oXl)), 0, ((String)localObject1).length(), 33);
        ((SpannableString)localObject4).setSpan(new a(), ((String)localObject1).length(), ((String)localObject2).length(), 33);
        paramc.qlo.setText((CharSequence)localObject4, TextView.BufferType.SPANNABLE);
        if ((!((ay)localObject3).qhQ) && (!"wx7fa037cc7dfabad5".equals(parambiz.uUb.mmR)))
        {
          paramc.qlo.setTextColor(this.mActivity.getResources().getColor(i.c.oXl));
          paramc.qlo.setOnTouchListener(null);
        }
        paramc.qlo.setTag(parambiz);
        break label1884;
      }
      paramc.qlo.setVisibility(8);
      break label1884;
      label3861:
      paramc.pSP.setVisibility(8);
      break label1912;
      paramc.pIu.setText(i.j.pkn);
      paramc.qlv.setClickable(false);
      paramc.qlv.setEnabled(false);
      break label2086;
      paramc.pIu.setText(i.j.pkp);
      paramc.qlv.setClickable(false);
      paramc.qlv.setEnabled(false);
      break label2086;
      paramc.pIu.setText(i.j.pko);
      paramc.qlv.setClickable(true);
      paramc.qlv.setEnabled(true);
      break label2086;
      label3960:
      if (!paramc.qlF) {
        break label2120;
      }
      paramc.qlB.setVisibility(8);
      break label2120;
      paramc.qlp.setVisibility(8);
      break label2148;
      label3991:
      parambiz = String.format(this.mActivity.getString(i.j.pkW), new Object[] { ((ay)localObject3).qhY });
      break label2209;
      label4021:
      if (((ay)localObject3).qhZ)
      {
        paramc.qll.setVisibility(0);
        parambiz = this.mActivity.getString(i.j.pkX);
        parambiz = com.tencent.mm.pluginsdk.ui.d.h.b(this.mActivity, parambiz.toString(), paramc.qll.getTextSize());
        paramc.qll.setText(parambiz);
        break label2236;
      }
      label4082:
      paramc.qll.setVisibility(8);
      break label2236;
      label4094:
      if (paramc.qmc == null) {
        break label2407;
      }
      paramc.qmc.setVisibility(8);
      break label2407;
      label4113:
      if (!paramc.qlA) {
        break label2461;
      }
      paramc.qlz.setVisibility(8);
      break label2461;
      label4132:
      if (!paramc.qlA)
      {
        if (paramc.pOm == null) {
          paramc.pOm = ((LinearLayout)paramc.qlz.inflate());
        }
        paramc.qls = ((MaskTextView)paramc.pOm.findViewById(i.f.oZJ));
        paramc.qls.setOnTouchListener(new ab());
        paramc.qlt = ((LinearLayout)paramc.lFh.findViewById(i.f.oZk));
        paramc.pOm.setTag(((ay)localObject3).qhr);
        paramc.qls.setTag(((ay)localObject3).qhr);
        paramc.qly = paramc.pOm.findViewById(i.f.oZN);
        paramc.qme = paramc.pOm.findViewById(i.f.oZL);
        paramc.qlA = true;
      }
      paramc.pOm.setVisibility(0);
      if ((((ay)localObject3).qie != null) && (((ay)localObject3).qie.size() > 0))
      {
        paramc.qls.setVisibility(0);
        a(paramc.qls, ((ay)localObject3).qie, paramInt2);
        label4316:
        if (((ay)localObject3).qif == null) {
          break label4401;
        }
        a(localbfh.uQT, ((ay)localObject3).qif, paramc);
      }
      for (;;)
      {
        if ((((ay)localObject3).qie == null) || (((ay)localObject3).qie.size() == 0) || (((ay)localObject3).qif == null) || (((ay)localObject3).qif.size() == 0)) {
          break label4413;
        }
        paramc.qly.setVisibility(0);
        break;
        paramc.qls.setVisibility(8);
        break label4316;
        label4401:
        paramc.qlt.setVisibility(8);
      }
      label4413:
      paramc.qly.setVisibility(8);
      break label2461;
      label4425:
      paramc.qlh.setVisibility(8);
      break label2501;
      label4437:
      paramInt1 = 0;
      break label2633;
      label4442:
      paramc.poY.setVisibility(8);
    }
    label4454:
    paramc = new com.tencent.mm.ui.a.b();
    paramc.Vl(paramav.getText().toString());
    paramc.Vl((String)localObject1);
    if (localObject2 != null) {
      paramc.Vl(((TextView)localObject2).getText().toString());
    }
    if (bool1) {
      paramc.Vl(paramm.sN.getString(a.k.ggk));
    }
    paramc.dc(parambiz);
    label4530:
    GMTrace.o(8520678244352L, 63484);
  }
  
  public abstract void a(c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, av paramav);
  
  public abstract void d(c paramc);
  
  public final void ig(boolean paramBoolean)
  {
    GMTrace.i(8520141373440L, 63480);
    this.pYh = paramBoolean;
    GMTrace.o(8520141373440L, 63480);
  }
  
  final class a
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    a()
    {
      GMTrace.i(8522423074816L, 63497);
      GMTrace.o(8522423074816L, 63497);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8522557292544L, 63498);
      a.this.pyk.pYU.qjW.onClick(paramView);
      GMTrace.o(8522557292544L, 63498);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8522691510272L, 63499);
      int i = a.this.mActivity.getResources().getColor(i.c.kbk);
      if (this.nfC)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8522691510272L, 63499);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8522691510272L, 63499);
    }
  }
  
  final class b
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    b()
    {
      GMTrace.i(8518799196160L, 63470);
      GMTrace.o(8518799196160L, 63470);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8518933413888L, 63471);
      a.this.pyk.pYU.qjM.onClick(paramView);
      GMTrace.o(8518933413888L, 63471);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8519067631616L, 63472);
      int i = a.this.mActivity.getResources().getColor(i.c.kbk);
      if (this.nfC)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8519067631616L, 63472);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8519067631616L, 63472);
    }
  }
  
  public static class c
  {
    public String eEM;
    public String eUg;
    public String hTy;
    public ImageView hqG;
    public TextView hqi;
    public int jHw;
    public TextView kHx;
    public View lFh;
    public boolean lLO;
    public TextView pIu;
    public anv pMp;
    public ImageView pOP;
    public LinearLayout pOm;
    public TextView pSP;
    public int pYZ;
    public bfh pmB;
    public boolean poX;
    public bf poY;
    public int position;
    public TextView pqx;
    public TextView qeo;
    public View qet;
    public long qkV;
    public int qkW;
    public AsyncTextView qkX;
    public ImageView qkY;
    public ViewGroup qkZ;
    public boolean qlA;
    public ViewStub qlB;
    public ViewStub qlC;
    public View qlD;
    public boolean qlE;
    public boolean qlF;
    public ViewStub qlG;
    public boolean qlH;
    public View qlI;
    public LinearLayout qlJ;
    public TextView qlK;
    public ViewStub qlL;
    public boolean qlM;
    public View qlN;
    public LinearLayout qlO;
    public ViewStub qlP;
    public boolean qlQ;
    public View qlR;
    public ImageView qlS;
    public boolean qlT;
    ViewStub qlU;
    boolean qlV;
    public ak qlW;
    public biz qlX;
    public com.tencent.mm.l.a qlY;
    public View qlZ;
    public AsyncNormalTextView qla;
    public TextView qlb;
    public TextView qlc;
    public SnsTranslateResultView qld;
    public LinearLayout qle;
    public ViewStub qlf;
    public boolean qlg;
    public TextView qlh;
    public TagImageView qli;
    public TextView qlj;
    public int qlk;
    public TextView qll;
    public AsyncTextView qlm;
    public AsyncTextView qln;
    public TextView qlo;
    public View qlp;
    public ImageView qlq;
    public View qlr;
    public MaskTextView qls;
    public LinearLayout qlt;
    public LinearLayout qlu;
    public View qlv;
    public LinearLayout qlw;
    public PhotosContent qlx;
    public View qly;
    public ViewStub qlz;
    public a qma;
    public ViewStub qmb;
    public View qmc;
    public MaskTextView qmd;
    public View qme;
    public TextView qmf;
    public String qmg;
    public View qmh;
    public Button qmi;
    public Button qmj;
    
    public c()
    {
      GMTrace.i(8524167905280L, 63510);
      this.qlg = false;
      this.qlk = 0;
      this.pYZ = 210;
      this.qlA = false;
      this.qlD = null;
      this.qlE = false;
      this.qlF = false;
      this.qlH = false;
      this.qlM = false;
      this.qlQ = false;
      this.qlT = false;
      this.qlV = false;
      this.qlW = new ak();
      GMTrace.o(8524167905280L, 63510);
    }
  }
  
  final class d
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    d()
    {
      GMTrace.i(8517457018880L, 63460);
      GMTrace.o(8517457018880L, 63460);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8517591236608L, 63461);
      a.this.pyk.pYU.qjN.onClick(paramView);
      GMTrace.o(8517591236608L, 63461);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8517725454336L, 63462);
      int i = a.this.mActivity.getResources().getColor(i.c.kbk);
      if (this.nfC)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8517725454336L, 63462);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8517725454336L, 63462);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
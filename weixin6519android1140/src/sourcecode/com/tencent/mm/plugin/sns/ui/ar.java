package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ar
{
  public static int[] qcP;
  public static int[] qcQ;
  public static int[] qcR;
  public static int[] qcS;
  public static int[] qcT;
  static double qcU;
  static double qcV;
  static double qcW;
  static double qcX;
  static double qcY;
  private Context context;
  private LinkedList<LinearLayout> qcZ;
  
  static
  {
    GMTrace.i(8482694627328L, 63201);
    qcP = new int[] { 0, 0, 1, 3, 6, 9 };
    qcQ = new int[] { i.f.oZx };
    qcR = new int[] { i.f.oZx, i.f.oZy, i.f.oZz };
    qcS = new int[] { i.f.oZx, i.f.oZy, i.f.oZz, i.f.oZA, i.f.oZB, i.f.oZC };
    qcT = new int[] { i.f.oZx, i.f.oZy, i.f.oZz, i.f.oZA, i.f.oZB, i.f.oZC, i.f.oZD, i.f.oZE, i.f.oZF };
    qcU = -1.0D;
    qcV = -1.0D;
    qcW = -1.0D;
    qcX = -1.0D;
    qcY = -1.0D;
    GMTrace.o(8482694627328L, 63201);
  }
  
  public ar(Context paramContext)
  {
    GMTrace.i(8481755103232L, 63194);
    this.qcZ = new LinkedList();
    this.context = paramContext;
    GMTrace.o(8481755103232L, 63194);
  }
  
  public ar(Context paramContext, byte paramByte)
  {
    GMTrace.i(8481889320960L, 63195);
    this.qcZ = new LinkedList();
    this.context = paramContext;
    GMTrace.o(8481889320960L, 63195);
  }
  
  private static void a(anu paramanu, QFadeImageView paramQFadeImageView, int paramInt, an paraman)
  {
    GMTrace.i(8482291974144L, 63198);
    ae.bja().b(paramanu, paramQFadeImageView, paramInt, paraman);
    GMTrace.o(8482291974144L, 63198);
  }
  
  private static void a(anu paramanu, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, an paraman, int paramInt3, boolean paramBoolean2)
  {
    GMTrace.i(8482560409600L, 63200);
    a(paramanu, paramQFadeImageView, paramString, paramInt1, paramInt2, paramBoolean1, paraman, paramInt3, paramBoolean2, new anw());
    GMTrace.o(8482560409600L, 63200);
  }
  
  private static void a(anu paramanu, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, an paraman, int paramInt3, boolean paramBoolean2, anw paramanw)
  {
    GMTrace.i(8482426191872L, 63199);
    if (paramQFadeImageView == null)
    {
      w.e("MicroMsg.SnsMultiLineImageLineMgr", "");
      GMTrace.o(8482426191872L, 63199);
      return;
    }
    ap localap = new ap();
    localap.eHy = paramString;
    localap.index = 0;
    paramString = new ArrayList();
    paramString.add(paramQFadeImageView);
    localap.qaR = paramString;
    localap.pYh = paramBoolean1;
    localap.position = paramInt2;
    paramQFadeImageView.setTag(localap);
    double d2 = 0.0D;
    double d1 = 0.0D;
    double d4;
    double d3;
    if ((paramInt3 == 11) && (paramBoolean2))
    {
      ae.bja().d(paramanu, paramQFadeImageView, paramInt1, paraman);
      if (paramanu.uCR != null)
      {
        d2 = paramanu.uCR.uDE;
        d1 = paramanu.uCR.uDF;
      }
      if ((d2 <= 0.0D) || (d1 <= 0.0D)) {
        break label458;
      }
      d4 = Math.min(qcV / d2, qcV / d1);
      d3 = d2 * d4;
      d4 = d1 * d4;
      d1 = d4;
      d2 = d3;
      if (d3 < qcW)
      {
        d1 = 1.0D * qcW / d3;
        d2 = d3 * d1;
        d1 = d4 * d1;
      }
      d3 = d1;
      d4 = d2;
      if (d1 < qcW)
      {
        d3 = 1.0D * qcW / d1;
        d4 = d2 * d3;
        d3 = d1 * d3;
      }
      d2 = d4;
      if (d4 > qcV) {
        d2 = qcV;
      }
      d1 = d3;
      d4 = d2;
      if (d3 > qcV)
      {
        d1 = qcV;
        d4 = d2;
      }
      label318:
      d2 = d4;
      if (d4 < 1.0D) {
        d2 = 1.0D;
      }
      d3 = d1;
      if (d1 < 1.0D) {
        d3 = 1.0D;
      }
      if ((paramanw == null) || (paramanw.uDE <= 0.0F) || (paramanw.uDF <= 0.0F)) {
        break label497;
      }
      d1 = paramanw.uDE;
      d2 = paramanw.uDF;
      d3 = d1;
      d1 = d2;
    }
    for (;;)
    {
      if ((paramQFadeImageView.getLayoutParams() instanceof FrameLayout.LayoutParams))
      {
        paramanu = (FrameLayout.LayoutParams)paramQFadeImageView.getLayoutParams();
        if ((paramanu.width == d3) && (paramanu.height == d1))
        {
          GMTrace.o(8482426191872L, 63199);
          return;
          ae.bja().a(paramanu, paramQFadeImageView, paramInt1, paraman);
          break;
          label458:
          d4 = qcU;
          d1 = qcU;
          break label318;
        }
        paramQFadeImageView.setLayoutParams(new FrameLayout.LayoutParams((int)d3, (int)d1));
      }
      GMTrace.o(8482426191872L, 63199);
      return;
      label497:
      d1 = d3;
      d3 = d2;
    }
  }
  
  public final void a(PhotosContent paramPhotosContent, biz parambiz, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, an paraman, List<anw> paramList)
  {
    GMTrace.i(8482157756416L, 63197);
    Object localObject1 = qcT;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      localObject1 = qcQ;
    }
    int i;
    for (;;)
    {
      parambiz = parambiz.uUc.ueW;
      if (qcU < 0.0D)
      {
        qcU = BackwardSupportUtil.b.a(this.context, 160.0F);
        qcV = BackwardSupportUtil.b.a(this.context, 200.0F);
        qcW = BackwardSupportUtil.b.a(this.context, 44.0F);
        qcX = BackwardSupportUtil.b.a(this.context, 66.0F);
        qcY = BackwardSupportUtil.b.a(this.context, 300.0F);
      }
      i = parambiz.size();
      if (i != 0) {
        break label225;
      }
      paramInt1 = 0;
      while (paramInt1 < localObject1.length)
      {
        ae.bja().cq(paramPhotosContent.vk(paramInt1));
        paramPhotosContent.vk(paramInt1).position = paramInt3;
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        localObject1 = qcR;
      } else if (paramInt2 == 4) {
        localObject1 = qcS;
      } else if (paramInt2 == 5) {
        localObject1 = qcT;
      }
    }
    paramPhotosContent.setVisibility(8);
    GMTrace.o(8482157756416L, 63197);
    return;
    label225:
    paramPhotosContent.vj(ae.bjl());
    paramPhotosContent.setVisibility(0);
    Object localObject2;
    if (i == 1)
    {
      i = 1;
      while (i < localObject1.length)
      {
        localObject2 = paramPhotosContent.vk(i);
        ((QFadeImageView)localObject2).setVisibility(8);
        ae.bja().cq((View)localObject2);
        paramPhotosContent.vk(i).position = paramInt3;
        i += 1;
      }
      paramPhotosContent.vk(0).setVisibility(0);
      if ((paramList != null) && (paramList.size() > 0))
      {
        a((anu)parambiz.get(0), paramPhotosContent.vk(0), paramString, paramInt1, paramInt3, paramBoolean, paraman, paramInt2, false, (anw)paramList.get(0));
        GMTrace.o(8482157756416L, 63197);
        return;
      }
      a((anu)parambiz.get(0), paramPhotosContent.vk(0), paramString, paramInt1, paramInt3, paramBoolean, paraman, paramInt2, false);
      GMTrace.o(8482157756416L, 63197);
      return;
    }
    if (i == 4)
    {
      paramList = new ArrayList();
      paramInt2 = localObject1.length - 1;
      i = 3;
      if (paramInt2 >= 0)
      {
        localObject1 = paramPhotosContent.vk(paramInt2);
        ((TagImageView)localObject1).position = paramInt3;
        if ((paramInt2 == 0) || (paramInt2 == 1) || (paramInt2 == 3) || (paramInt2 == 4))
        {
          ((TagImageView)localObject1).setVisibility(0);
          paramList.add(localObject1);
          localObject2 = new ap();
          ((ap)localObject2).eHy = paramString;
          ((ap)localObject2).index = i;
          ((ap)localObject2).qaR = paramList;
          ((ap)localObject2).pYh = paramBoolean;
          ((ap)localObject2).position = paramInt3;
          ((TagImageView)localObject1).setTag(localObject2);
          a((anu)parambiz.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paraman);
          i -= 1;
        }
        for (;;)
        {
          paramInt2 -= 1;
          break;
          ((TagImageView)localObject1).setVisibility(8);
          ae.bja().cq((View)localObject1);
        }
      }
      GMTrace.o(8482157756416L, 63197);
      return;
    }
    paramList = new ArrayList();
    paramInt2 = localObject1.length - 1;
    if (paramInt2 >= 0)
    {
      localObject1 = paramPhotosContent.vk(paramInt2);
      ((TagImageView)localObject1).position = paramInt3;
      if (paramInt2 < parambiz.size())
      {
        ((TagImageView)localObject1).setVisibility(0);
        paramList.add(localObject1);
        localObject2 = new ap();
        ((ap)localObject2).eHy = paramString;
        ((ap)localObject2).index = paramInt2;
        ((ap)localObject2).qaR = paramList;
        ((ap)localObject2).pYh = paramBoolean;
        ((ap)localObject2).position = paramInt3;
        ((TagImageView)localObject1).setTag(localObject2);
        a((anu)parambiz.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paraman);
      }
      for (;;)
      {
        paramInt2 -= 1;
        break;
        ((TagImageView)localObject1).setVisibility(8);
        ae.bja().cq((View)localObject1);
      }
    }
    GMTrace.o(8482157756416L, 63197);
  }
  
  public final void a(PhotosContent paramPhotosContent, biz parambiz, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, an paraman, boolean paramBoolean2)
  {
    GMTrace.i(8482023538688L, 63196);
    int[] arrayOfInt = qcT;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      arrayOfInt = qcQ;
    }
    int i;
    for (;;)
    {
      parambiz = parambiz.uUc.ueW;
      if (qcU < 0.0D)
      {
        qcU = BackwardSupportUtil.b.a(this.context, 160.0F);
        qcV = BackwardSupportUtil.b.a(this.context, 200.0F);
        qcW = BackwardSupportUtil.b.a(this.context, 44.0F);
        qcX = BackwardSupportUtil.b.a(this.context, 66.0F);
        qcY = BackwardSupportUtil.b.a(this.context, 300.0F);
      }
      i = parambiz.size();
      if (i != 0) {
        break label227;
      }
      paramInt1 = 0;
      while (paramInt1 < arrayOfInt.length)
      {
        ae.bja().cq(paramPhotosContent.vk(paramInt1));
        paramPhotosContent.vk(paramInt1).position = paramInt3;
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        arrayOfInt = qcR;
      } else if (paramInt2 == 4) {
        arrayOfInt = qcS;
      } else if (paramInt2 == 5) {
        arrayOfInt = qcT;
      }
    }
    paramPhotosContent.setVisibility(8);
    GMTrace.o(8482023538688L, 63196);
    return;
    label227:
    paramPhotosContent.setVisibility(0);
    if (i == 1)
    {
      i = 1;
      while (i < arrayOfInt.length)
      {
        TagImageView localTagImageView = paramPhotosContent.vk(i);
        localTagImageView.setVisibility(8);
        ae.bja().cq(localTagImageView);
        paramPhotosContent.vk(i).position = paramInt3;
        i += 1;
      }
      paramPhotosContent.vk(0).setVisibility(0);
      a((anu)parambiz.get(0), paramPhotosContent.vk(0), paramString, paramInt1, paramInt3, paramBoolean1, paraman, paramInt2, paramBoolean2);
      GMTrace.o(8482023538688L, 63196);
      return;
    }
    GMTrace.o(8482023538688L, 63196);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
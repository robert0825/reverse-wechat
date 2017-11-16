package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelstat.o.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.d;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.e;
import com.tencent.mm.plugin.sns.model.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;

public class AdListView
  extends ListView
{
  com.tencent.mm.plugin.sns.a.b.b pND;
  f pNE;
  e pNF;
  private boolean pNG;
  private HashSet<String> pNH;
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8547387572224L, 63683);
    this.pNG = true;
    this.pNH = new HashSet();
    GMTrace.o(8547387572224L, 63683);
  }
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8547253354496L, 63682);
    this.pNG = true;
    this.pNH = new HashSet();
    GMTrace.o(8547253354496L, 63682);
  }
  
  protected void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(8548058660864L, 63688);
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
    String str1 = "";
    paramLayoutParams = str1;
    a.c localc;
    d locald;
    String str2;
    if (paramView.getTag() != null)
    {
      paramLayoutParams = str1;
      if ((paramView.getTag() instanceof a.c))
      {
        localc = (a.c)paramView.getTag();
        str1 = localc.position + " " + localc.eEM;
        d.pBQ.Id(localc.qlX.mmR);
        locald = d.pBQ;
        str2 = localc.qlX.mmR;
        if (localc.qlX.uUb != null) {
          break label474;
        }
      }
    }
    label474:
    for (paramLayoutParams = "";; paramLayoutParams = localc.qlX.uUb.mmR)
    {
      locald.dK(str2, paramLayoutParams);
      if ((this.pND != null) && (localc.poX)) {
        this.pND.a(localc.position, localc.eEM, localc.hTy, localc.lLO, paramView, localc.qkV, localc.poY, localc.pmB, localc.jHw, 1);
      }
      if ((!this.pNH.contains(localc.eUg)) && (((localc.poX) && (localc.qlX.uUc.ueV == 15)) || (localc.qlX.uUc.ueV == 18)))
      {
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (localc.qlX.uUc.ueV == 15)
        {
          bool1 = bool2;
          if ((localc.qlW.oUt instanceof SightPlayImageView)) {
            bool1 = ((SightPlayImageView)localc.qlW.oUt).oTg.bgr();
          }
        }
        j.a(ae.bjd().Ir(localc.eUg), false, bool1);
        this.pNH.add(localc.eUg);
      }
      if (this.pNE != null) {
        this.pNE.a(localc.eEM, localc.qlX);
      }
      if (this.pNF != null) {
        this.pNF.a(localc.position, localc.eEM, localc.qkV, localc.hTy, localc.qlX, localc.poX, localc.poY);
      }
      paramLayoutParams = str1;
      if (r.hkJ) {
        w.d("MicroMsg.AdListView", "3childview  onAdded " + paramLayoutParams + " count:" + getChildCount());
      }
      GMTrace.o(8548058660864L, 63688);
      return;
    }
  }
  
  protected void detachViewFromParent(int paramInt)
  {
    GMTrace.i(8547924443136L, 63687);
    if (r.hkJ) {
      w.d("MicroMsg.AdListView", "2childview  onRemoved " + paramInt + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramInt);
    GMTrace.o(8547924443136L, 63687);
  }
  
  protected void detachViewFromParent(View paramView)
  {
    GMTrace.i(8547790225408L, 63686);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).eEM;
      }
    }
    if (r.hkJ) {
      w.d("MicroMsg.AdListView", "1childview  onRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramView);
    GMTrace.o(8547790225408L, 63686);
  }
  
  protected void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    GMTrace.i(8548729749504L, 63693);
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      View localView = getChildAt(i);
      String str = "";
      Object localObject = str;
      if (localView.getTag() != null)
      {
        localObject = str;
        if ((localView.getTag() instanceof a.c))
        {
          localObject = (a.c)localView.getTag();
          if ((this.pND != null) && (((a.c)localObject).poX)) {
            this.pND.r(((a.c)localObject).position, ((a.c)localObject).eEM, ((a.c)localObject).hTy);
          }
          if (this.pNE != null) {
            this.pNE.Hi(((a.c)localObject).eEM);
          }
          if (this.pNF != null) {
            this.pNF.a(((a.c)localObject).position, ((a.c)localObject).eEM, ((a.c)localObject).qkV, ((a.c)localObject).hTy, ((a.c)localObject).qlX, ((a.c)localObject).poX);
          }
          localObject = ((a.c)localObject).position + " " + ((a.c)localObject).eEM;
        }
      }
      if (r.hkJ) {
        w.d("MicroMsg.AdListView", "8removeView  detachViewsFromParent " + (String)localObject + " count:" + getChildCount());
      }
      i += 1;
    }
    super.detachViewsFromParent(paramInt1, paramInt2);
    GMTrace.o(8548729749504L, 63693);
  }
  
  protected void layoutChildren()
  {
    GMTrace.i(8547521789952L, 63684);
    super.layoutChildren();
    GMTrace.o(8547521789952L, 63684);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8547656007680L, 63685);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8547656007680L, 63685);
  }
  
  public void onViewAdded(View paramView)
  {
    GMTrace.i(8548192878592L, 63689);
    String str2 = "";
    String str1 = str2;
    a.c localc;
    d locald;
    String str3;
    if (paramView.getTag() != null)
    {
      str1 = str2;
      if ((paramView.getTag() instanceof a.c))
      {
        localc = (a.c)paramView.getTag();
        str2 = localc.position + " " + localc.eEM;
        d.pBQ.Id(localc.qlX.mmR);
        locald = d.pBQ;
        str3 = localc.qlX.mmR;
        if (localc.qlX.uUb != null) {
          break label469;
        }
      }
    }
    label469:
    for (str1 = "";; str1 = localc.qlX.uUb.mmR)
    {
      locald.dK(str3, str1);
      if ((this.pND != null) && (localc.poX)) {
        this.pND.a(localc.position, localc.eEM, localc.hTy, localc.lLO, paramView, localc.qkV, localc.poY, localc.pmB, localc.jHw, 1);
      }
      if ((!this.pNH.contains(localc.eUg)) && (((localc.poX) && (localc.qlX.uUc.ueV == 15)) || (localc.qlX.uUc.ueV == 18)))
      {
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (localc.qlX.uUc.ueV == 15)
        {
          bool1 = bool2;
          if ((localc.qlW.oUt instanceof SightPlayImageView)) {
            bool1 = ((SightPlayImageView)localc.qlW.oUt).oTg.bgr();
          }
        }
        j.a(ae.bjd().Ir(localc.eUg), false, bool1);
        this.pNH.add(localc.eUg);
      }
      if (this.pNE != null) {
        this.pNE.a(localc.eEM, localc.qlX);
      }
      if (this.pNF != null) {
        this.pNF.a(localc.position, localc.eEM, localc.qkV, localc.hTy, localc.qlX, localc.poX, localc.poY);
      }
      str1 = str2;
      if (r.hkJ) {
        w.d("MicroMsg.AdListView", "4childview  onViewAdded " + str1 + " count:" + getChildCount());
      }
      GMTrace.o(8548192878592L, 63689);
      return;
    }
  }
  
  public void onViewRemoved(View paramView)
  {
    GMTrace.i(8548327096320L, 63690);
    String str = "";
    Object localObject1 = str;
    Object localObject2;
    int i;
    Object localObject3;
    bhf localbhf;
    if (paramView.getTag() != null)
    {
      localObject1 = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject2 = (a.c)paramView.getTag();
        paramView = ((a.c)localObject2).position + " " + ((a.c)localObject2).eEM;
        if ((this.pND != null) && (((a.c)localObject2).poX)) {
          this.pND.r(((a.c)localObject2).position, ((a.c)localObject2).eEM, ((a.c)localObject2).hTy);
        }
        if (this.pNE != null) {
          this.pNE.Hi(((a.c)localObject2).eEM);
        }
        if (this.pNF != null) {
          this.pNF.a(((a.c)localObject2).position, ((a.c)localObject2).eEM, ((a.c)localObject2).qkV, ((a.c)localObject2).hTy, ((a.c)localObject2).qlX, ((a.c)localObject2).poX);
        }
        if (((a.c)localObject2).qlX.uUc.ueV != 3) {
          break label483;
        }
        localObject1 = ae.bjd().Ir(((a.c)localObject2).eUg);
        if (localObject1 != null) {
          break label337;
        }
        i = 0;
        localObject1 = o.a.gZA;
        str = ((a.c)localObject2).qlX.pTh;
        localObject2 = i.dt(((a.c)localObject2).qkV);
        if (bg.nm(str)) {
          break label483;
        }
        localObject3 = Base64.decode(str, 0);
        localbhf = new bhf();
      }
    }
    for (;;)
    {
      try
      {
        localbhf.aD((byte[])localObject3);
        localObject3 = localbhf.uTb;
        if (localObject3 != null) {
          continue;
        }
        localObject1 = paramView;
      }
      catch (Exception localException)
      {
        label337:
        w.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException, "", new Object[0]);
        localView = paramView;
        continue;
        w.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%d), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { Integer.valueOf(localView.value), str, localbhf.uTb.uTe, localbhf.uTb.uTf });
        ((c)h.h(c.class)).a(13235, i, new Object[] { localView.value, localbhf.uTb.uTe, localbhf.uTb.uTf, localObject2 });
      }
      if (r.hkJ) {
        w.d("MicroMsg.AdListView", "5childview  onViewRemoved " + (String)localObject1 + " count:" + getChildCount());
      }
      GMTrace.o(8548327096320L, 63690);
      return;
      i = ((m)localObject1).bml();
      break;
      label483:
      View localView = paramView;
    }
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(8548595531776L, 63692);
    super.removeView(paramView);
    String str2 = "";
    String str1 = str2;
    if (paramView.getTag() != null)
    {
      str1 = str2;
      if ((paramView.getTag() instanceof a.c))
      {
        paramView = (a.c)paramView.getTag();
        str1 = paramView.position + " " + paramView.eEM;
      }
    }
    if (r.hkJ) {
      w.d("MicroMsg.AdListView", "7removeView  onViewRemoved " + str1 + " count:" + getChildCount());
    }
    GMTrace.o(8548595531776L, 63692);
  }
  
  public void removeViewInLayout(View paramView)
  {
    GMTrace.i(8548461314048L, 63691);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).eEM;
      }
    }
    if (r.hkJ) {
      w.d("MicroMsg.AdListView", "6removeViewInLayout  onViewRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.removeViewInLayout(paramView);
    GMTrace.o(8548461314048L, 63691);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\AdListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
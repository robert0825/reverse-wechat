package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

final class c
  extends BaseAdapter
{
  private Context context;
  private com.tencent.mm.ao.a.a.c kEK;
  private List<dh> wrA;
  boolean wrB;
  
  public c(Context paramContext)
  {
    GMTrace.i(2109365813248L, 15716);
    this.wrB = false;
    this.context = paramContext;
    this.wrA = new ArrayList();
    paramContext = new c.a();
    paramContext.gKR = R.g.aYh;
    this.kEK = paramContext.Jn();
    at(null);
    GMTrace.o(2109365813248L, 15716);
  }
  
  private dh CB(int paramInt)
  {
    GMTrace.i(2109768466432L, 15719);
    dh localdh = (dh)this.wrA.get(paramInt);
    GMTrace.o(2109768466432L, 15719);
    return localdh;
  }
  
  public final void at(List<dh> paramList)
  {
    GMTrace.i(2109500030976L, 15717);
    this.wrA.clear();
    if ((paramList != null) && (paramList.size() != 0)) {
      this.wrA.addAll(paramList);
    }
    if (this.wrB)
    {
      paramList = this.wrA;
      localdh = new dh();
      localdh.qPV = R.g.aZR;
      localdh.fMz = this.context.getString(R.l.dhs);
      paramList.add(localdh);
    }
    paramList = this.wrA;
    dh localdh = new dh();
    localdh.qPV = R.g.aZQ;
    localdh.fMz = this.context.getString(R.l.eaM);
    paramList.add(localdh);
    w.d("MicroMsg.AppInfoListAdapter", "updateData mDeviceInfoList.size() = %d.", new Object[] { Integer.valueOf(this.wrA.size()) });
    GMTrace.o(2109500030976L, 15717);
  }
  
  public final int getCount()
  {
    GMTrace.i(2109634248704L, 15718);
    int i = this.wrA.size();
    GMTrace.o(2109634248704L, 15718);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(2109902684160L, 15720);
    long l = paramInt;
    GMTrace.o(2109902684160L, 15720);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2110036901888L, 15721);
    dh localdh = CB(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = new eo();
      localObject = View.inflate(paramViewGroup.getContext(), R.i.cFQ, null);
      paramView.kHP = ((View)localObject).findViewById(R.h.brL);
      paramView.jUm = ((TextView)((View)localObject).findViewById(R.h.bPo));
      paramView.iub = ((ImageView)((View)localObject).findViewById(R.h.bGn));
      paramView.wBp = ((TextView)((View)localObject).findViewById(R.h.ccb));
      paramView.wHx = ((SendDataToDeviceProgressBar)((View)localObject).findViewById(R.h.cca));
      paramView.wHx.setVisibility(4);
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
      paramViewGroup.jUm.setText(localdh.fMz);
      w.v("MicroMsg.AppInfoListAdapter", "position(%s), name(%s).", new Object[] { Integer.valueOf(paramInt), localdh.fMz });
      if (localdh.qPV == 0) {
        break label223;
      }
      paramViewGroup.iub.setImageResource(localdh.qPV);
    }
    for (;;)
    {
      paramViewGroup.kHP.setTag(Integer.valueOf(paramInt));
      GMTrace.o(2110036901888L, 15721);
      return paramView;
      paramViewGroup = (eo)paramView.getTag();
      break;
      label223:
      localObject = g.b(localdh.appId, 1, com.tencent.mm.br.a.getDensity(this.context));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
        paramViewGroup.iub.setImageBitmap((Bitmap)localObject);
      } else {
        n.Jd().a(localdh.iconUrl, paramViewGroup.iub, this.kEK);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
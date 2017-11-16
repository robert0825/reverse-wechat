package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import java.util.ArrayList;

public final class m
  extends BaseAdapter
{
  private Context mContext;
  ArrayList<w> mData;
  w rpL;
  
  public m(Context paramContext, ArrayList<w> paramArrayList)
  {
    GMTrace.i(6985227436032L, 52044);
    this.mData = null;
    this.rpL = null;
    this.mContext = paramContext;
    this.mData = paramArrayList;
    GMTrace.o(6985227436032L, 52044);
  }
  
  public final int getCount()
  {
    GMTrace.i(6985361653760L, 52045);
    if (this.mData != null)
    {
      int i = this.mData.size();
      GMTrace.o(6985361653760L, 52045);
      return i;
    }
    GMTrace.o(6985361653760L, 52045);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6985630089216L, 52047);
    GMTrace.o(6985630089216L, 52047);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6985764306944L, 52048);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, a.g.sQn, null);
      paramViewGroup = new a();
      paramViewGroup.ikm = ((TextView)paramView.findViewById(a.f.title));
      paramViewGroup.rpM = ((ImageView)paramView.findViewById(a.f.sHc));
      paramView.setTag(paramViewGroup);
      w localw = wZ(paramInt);
      if (localw != null)
      {
        paramViewGroup.ikm.setText(localw.field_wallet_name);
        if (localw.field_wallet_selected != 1) {
          break label136;
        }
        this.rpL = localw;
        paramViewGroup.rpM.setImageResource(a.h.cOv);
      }
    }
    for (;;)
    {
      GMTrace.o(6985764306944L, 52048);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label136:
      paramViewGroup.rpM.setImageResource(a.h.cOu);
    }
  }
  
  public final w wZ(int paramInt)
  {
    GMTrace.i(6985495871488L, 52046);
    if ((this.mData != null) && (getCount() > paramInt))
    {
      w localw = (w)this.mData.get(paramInt);
      GMTrace.o(6985495871488L, 52046);
      return localw;
    }
    GMTrace.o(6985495871488L, 52046);
    return null;
  }
  
  private final class a
  {
    TextView ikm;
    ImageView rpM;
    
    public a()
    {
      GMTrace.i(6997441249280L, 52135);
      GMTrace.o(6997441249280L, 52135);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
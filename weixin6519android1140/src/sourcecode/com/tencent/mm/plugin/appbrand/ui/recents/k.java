package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;

abstract class k<_Data, _ViewHolder extends RecyclerView.t>
{
  k()
  {
    GMTrace.i(16346913964032L, 121794);
    GMTrace.o(16346913964032L, 121794);
  }
  
  public abstract _ViewHolder a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup);
  
  public abstract void a(_ViewHolder param_ViewHolder, _Data param_Data);
  
  public boolean a(_ViewHolder param_ViewHolder, Object paramObject1, Object paramObject2)
  {
    GMTrace.i(16347316617216L, 121797);
    GMTrace.o(16347316617216L, 121797);
    return false;
  }
  
  public abstract long aP(_Data param_Data);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
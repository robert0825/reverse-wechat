package com.tencent.mm.plugin.sns.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import java.util.HashMap;
import java.util.List;

public final class ba
  implements AdapterView.OnItemClickListener
{
  public LayoutInflater CJ;
  private Context mContext;
  private m qij;
  p.c qik;
  p.d qil;
  public n qim;
  private a qin;
  public HashMap<Integer, CharSequence> qio;
  public HashMap<Integer, Integer> qip;
  
  public ba(Context paramContext)
  {
    GMTrace.i(8721602183168L, 64981);
    this.qio = new HashMap();
    this.qip = new HashMap();
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    this.qij = new m(paramContext);
    this.qim = new n();
    GMTrace.o(8721602183168L, 64981);
  }
  
  private void dismiss()
  {
    GMTrace.i(8722004836352L, 64984);
    if (this.qij.isShowing()) {
      this.qij.dismiss();
    }
    GMTrace.o(8722004836352L, 64984);
  }
  
  public final Dialog bpI()
  {
    GMTrace.i(8722139054080L, 64985);
    if (this.qik != null)
    {
      this.qim.clear();
      this.qim = new n();
      this.qik.a(this.qim);
    }
    if (this.qim.cac())
    {
      w.w("MicroMsg.SnsTimelineListMenu", "show, menu empty");
      GMTrace.o(8722139054080L, 64985);
      return null;
    }
    if (this.qin == null) {
      this.qin = new a((byte)0);
    }
    this.qij.jDh = this.qin;
    this.qij.tFM = this;
    this.qij.setTitle(this.qim.Kq);
    this.qij.show();
    m localm = this.qij;
    GMTrace.o(8722139054080L, 64985);
    return localm;
  }
  
  public final void c(int paramInt, CharSequence paramCharSequence)
  {
    GMTrace.i(8721736400896L, 64982);
    this.qio.put(Integer.valueOf(paramInt), paramCharSequence);
    GMTrace.o(8721736400896L, 64982);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(8721870618624L, 64983);
    paramAdapterView = (o)this.qim.wdA.get(paramInt);
    if (paramAdapterView.performClick())
    {
      w.i("MicroMsg.SnsTimelineListMenu", "onItemClick menu item has listener");
      dismiss();
      GMTrace.o(8721870618624L, 64983);
      return;
    }
    if (this.qil != null) {
      this.qil.c(paramAdapterView, paramInt);
    }
    dismiss();
    GMTrace.o(8721870618624L, 64983);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(8366596292608L, 62336);
      GMTrace.o(8366596292608L, 62336);
    }
    
    public final int getCount()
    {
      GMTrace.i(8366730510336L, 62337);
      int i = ba.this.qim.size();
      GMTrace.o(8366730510336L, 62337);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8366864728064L, 62338);
      GMTrace.o(8366864728064L, 62338);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8366998945792L, 62339);
      GMTrace.o(8366998945792L, 62339);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8367133163520L, 62340);
      MenuItem localMenuItem;
      if (paramView == null)
      {
        paramView = ba.this.CJ.inflate(i.g.pgz, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.ikm = ((TextView)paramView.findViewById(i.f.title));
        paramViewGroup.qir = ((TextView)paramView.findViewById(i.f.pbJ));
        paramView.setTag(paramViewGroup);
        localMenuItem = ba.this.qim.getItem(paramInt);
        paramViewGroup.ikm.setText(localMenuItem.getTitle());
        if (ba.this.qio.get(Integer.valueOf(localMenuItem.getItemId())) == null) {
          break label235;
        }
        paramViewGroup.qir.setText((CharSequence)ba.this.qio.get(Integer.valueOf(localMenuItem.getItemId())));
        paramViewGroup.qir.setVisibility(0);
      }
      for (;;)
      {
        if (ba.this.qip.get(Integer.valueOf(localMenuItem.getItemId())) != null) {
          paramViewGroup.qir.setTextColor(((Integer)ba.this.qip.get(Integer.valueOf(localMenuItem.getItemId()))).intValue());
        }
        GMTrace.o(8367133163520L, 62340);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label235:
        paramViewGroup.qir.setVisibility(4);
      }
    }
    
    private final class a
    {
      TextView ikm;
      TextView qir;
      
      public a()
      {
        GMTrace.i(8723078578176L, 64992);
        GMTrace.o(8723078578176L, 64992);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
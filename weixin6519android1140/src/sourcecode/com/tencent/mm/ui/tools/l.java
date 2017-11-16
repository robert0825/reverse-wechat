package com.tencent.mm.ui.tools;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.Iterator;
import java.util.List;

public final class l
  implements AdapterView.OnItemClickListener
{
  public LayoutInflater CJ;
  private DialogInterface.OnDismissListener iKD;
  private Context mContext;
  public m qij;
  public p.c qik;
  public p.d qil;
  public n qim;
  private a xhS;
  public p.a xhT;
  public p.b xhU;
  
  public l(Context paramContext)
  {
    GMTrace.i(2049102053376L, 15267);
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    this.qij = new m(paramContext);
    this.qim = new n();
    GMTrace.o(2049102053376L, 15267);
  }
  
  public final void a(View paramView, int paramInt, long paramLong, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd)
  {
    GMTrace.i(2049370488832L, 15269);
    if (((this.mContext instanceof MMFragmentActivity)) && (((MMFragmentActivity)this.mContext).iur))
    {
      w.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenuForAdapterView");
      GMTrace.o(2049370488832L, 15269);
      return;
    }
    this.qim.clear();
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
    paramOnCreateContextMenuListener.onCreateContextMenu(this.qim, paramView, localAdapterContextMenuInfo);
    paramView = this.qim.wdA.iterator();
    while (paramView.hasNext()) {
      ((o)paramView.next()).wdD = localAdapterContextMenuInfo;
    }
    bpI();
    this.qil = paramd;
    GMTrace.o(2049370488832L, 15269);
  }
  
  public final void a(View paramView, final View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd)
  {
    GMTrace.i(2049236271104L, 15268);
    this.qil = paramd;
    w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu");
    if ((paramView instanceof AbsListView))
    {
      w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView");
      ((AbsListView)paramView).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1957028691968L, 14581);
          l.this.qim.clear();
          w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView long click");
          paramAnonymousAdapterView = new AdapterView.AdapterContextMenuInfo(paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          paramOnCreateContextMenuListener.onCreateContextMenu(l.this.qim, paramAnonymousView, paramAnonymousAdapterView);
          paramAnonymousView = l.this.qim.wdA.iterator();
          while (paramAnonymousView.hasNext()) {
            ((o)paramAnonymousView.next()).wdD = paramAnonymousAdapterView;
          }
          l.this.bpI();
          GMTrace.o(1957028691968L, 14581);
          return true;
        }
      });
      GMTrace.o(2049236271104L, 15268);
      return;
    }
    if ((paramView instanceof MMWebView))
    {
      w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu for webview");
      paramView.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(1959444611072L, 14599);
          w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view long click");
          l.this.qim.clear();
          paramOnCreateContextMenuListener.onCreateContextMenu(l.this.qim, paramAnonymousView, null);
          l.this.bpI();
          if (l.this.qim.size() > 0)
          {
            GMTrace.o(1959444611072L, 14599);
            return true;
          }
          GMTrace.o(1959444611072L, 14599);
          return false;
        }
      });
      GMTrace.o(2049236271104L, 15268);
      return;
    }
    w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view");
    paramView.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(1933137936384L, 14403);
        w.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view long click");
        l.this.qim.clear();
        paramOnCreateContextMenuListener.onCreateContextMenu(l.this.qim, paramAnonymousView, null);
        l.this.bpI();
        GMTrace.o(1933137936384L, 14403);
        return true;
      }
    });
    GMTrace.o(2049236271104L, 15268);
  }
  
  public final void a(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(17518097858560L, 130520);
    if (((this.mContext instanceof MMFragmentActivity)) && (((MMFragmentActivity)this.mContext).iur))
    {
      w.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenu");
      GMTrace.o(17518097858560L, 130520);
      return;
    }
    this.iKD = paramOnDismissListener;
    this.qim.clear();
    paramOnCreateContextMenuListener.onCreateContextMenu(this.qim, paramView, null);
    bpI();
    this.qil = paramd;
    GMTrace.o(17518097858560L, 130520);
  }
  
  public final void b(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd)
  {
    GMTrace.i(2049504706560L, 15270);
    a(paramView, paramOnCreateContextMenuListener, paramd, null);
    GMTrace.o(2049504706560L, 15270);
  }
  
  public final Dialog bpI()
  {
    GMTrace.i(2050041577472L, 15274);
    if (this.qik != null)
    {
      this.qim.clear();
      this.qim = new n();
      this.qik.a(this.qim);
    }
    if (this.qim.cac())
    {
      w.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
      GMTrace.o(2050041577472L, 15274);
      return null;
    }
    if (this.xhS == null) {
      this.xhS = new a((byte)0);
    }
    this.qij.jDh = this.xhS;
    this.qij.tFM = this;
    this.qij.setTitle(this.qim.Kq);
    this.qij.setOnDismissListener(this.iKD);
    this.qij.show();
    m localm = this.qij;
    GMTrace.o(2050041577472L, 15274);
    return localm;
  }
  
  public final void dismiss()
  {
    GMTrace.i(2049907359744L, 15273);
    if (this.qij.isShowing()) {
      this.qij.dismiss();
    }
    GMTrace.o(2049907359744L, 15273);
  }
  
  public final void e(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(2049638924288L, 15271);
    this.qij.setOnCancelListener(paramOnCancelListener);
    GMTrace.o(2049638924288L, 15271);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(2049773142016L, 15272);
    paramAdapterView = (o)this.qim.wdA.get(paramInt);
    if (paramAdapterView.performClick())
    {
      w.i("MicroMsg.MMSubMenuHelper", "onItemClick menu item has listener");
      dismiss();
      GMTrace.o(2049773142016L, 15272);
      return;
    }
    if (this.qil != null) {
      this.qil.c(paramAdapterView, paramInt);
    }
    dismiss();
    GMTrace.o(2049773142016L, 15272);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(2051115319296L, 15282);
      GMTrace.o(2051115319296L, 15282);
    }
    
    public final int getCount()
    {
      GMTrace.i(2051249537024L, 15283);
      int i = l.this.qim.size();
      GMTrace.o(2051249537024L, 15283);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(2051383754752L, 15284);
      GMTrace.o(2051383754752L, 15284);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2051517972480L, 15285);
      GMTrace.o(2051517972480L, 15285);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2051652190208L, 15286);
      MenuItem localMenuItem;
      if (paramView == null)
      {
        paramView = l.this.CJ.inflate(a.h.gfn, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.ikm = ((TextView)paramView.findViewById(a.g.title));
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(a.g.icon));
        paramView.setTag(paramViewGroup);
        localMenuItem = l.this.qim.getItem(paramInt);
        paramViewGroup.ikm.setText(localMenuItem.getTitle());
        Drawable localDrawable = l.this.qim.getItem(paramInt).getIcon();
        if (localDrawable == null) {
          break label188;
        }
        paramViewGroup.iCr.setVisibility(0);
        paramViewGroup.iCr.setImageDrawable(localDrawable);
      }
      for (;;)
      {
        if (l.this.xhU != null) {
          l.this.xhU.a(paramViewGroup.ikm, localMenuItem);
        }
        GMTrace.o(2051652190208L, 15286);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label188:
        if (l.this.xhT != null)
        {
          paramViewGroup.iCr.setVisibility(0);
          l.this.xhT.a(paramViewGroup.iCr, localMenuItem);
        }
        else
        {
          paramViewGroup.iCr.setVisibility(8);
        }
      }
    }
    
    private final class a
    {
      ImageView iCr;
      TextView ikm;
      
      public a()
      {
        GMTrace.i(1959981481984L, 14603);
        GMTrace.o(1959981481984L, 14603);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
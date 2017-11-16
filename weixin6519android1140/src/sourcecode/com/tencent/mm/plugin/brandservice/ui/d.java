package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class d
  extends com.tencent.mm.ui.base.sortview.a
{
  private static a.b jtx;
  public String jty;
  
  public d(Object paramObject)
  {
    super(1, paramObject);
    GMTrace.i(10852308615168L, 80856);
    GMTrace.o(10852308615168L, 80856);
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(20417603436544L, 152123);
    if ((this.data instanceof String)) {
      this.jty = ((String)this.data);
    }
    GMTrace.o(20417603436544L, 152123);
  }
  
  public final a.b aig()
  {
    GMTrace.i(20417335001088L, 152121);
    if (jtx == null) {
      jtx = new a.b()
      {
        public final void a(Context paramAnonymousContext, a.a paramAnonymousa, com.tencent.mm.ui.base.sortview.a paramAnonymousVarArgs)
        {
          GMTrace.i(20418811396096L, 152132);
          if ((paramAnonymousContext == null) || (paramAnonymousa == null) || (paramAnonymousVarArgs == null))
          {
            w.e("MicroMsg.CatalogDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            GMTrace.o(20418811396096L, 152132);
            return;
          }
          if (!(paramAnonymousa instanceof d.a))
          {
            w.e("MicroMsg.CatalogDataItem", "The ViewHolder is not a instance of CatalogViewHolder.");
            GMTrace.o(20418811396096L, 152132);
            return;
          }
          if (!(paramAnonymousVarArgs instanceof d))
          {
            w.e("MicroMsg.CatalogDataItem", "The DataItem is not a instance of CatalogDataItem.");
            GMTrace.o(20418811396096L, 152132);
            return;
          }
          paramAnonymousContext = (d.a)paramAnonymousa;
          paramAnonymousa = (d)paramAnonymousVarArgs;
          com.tencent.mm.plugin.brandservice.a.a.b(paramAnonymousContext.jtq, paramAnonymousa.jty);
          GMTrace.o(20418811396096L, 152132);
        }
        
        public final void a(View paramAnonymousView, a.a paramAnonymousa)
        {
          GMTrace.i(20418945613824L, 152133);
          if ((paramAnonymousView != null) && (paramAnonymousa != null) && ((paramAnonymousa instanceof d.a))) {
            ((d.a)paramAnonymousa).jtq = ((TextView)paramAnonymousView.findViewById(R.h.blV));
          }
          GMTrace.o(20418945613824L, 152133);
        }
        
        public final boolean a(Context paramAnonymousContext, com.tencent.mm.ui.base.sortview.a paramAnonymousa, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(20418677178368L, 152131);
          GMTrace.o(20418677178368L, 152131);
          return true;
        }
        
        public final View b(Context paramAnonymousContext, View paramAnonymousView)
        {
          GMTrace.i(10889352708096L, 81132);
          View localView = paramAnonymousView;
          if (paramAnonymousView == null) {
            localView = View.inflate(paramAnonymousContext, R.i.cFw, null);
          }
          GMTrace.o(10889352708096L, 81132);
          return localView;
        }
      };
    }
    a.b localb = jtx;
    GMTrace.o(20417335001088L, 152121);
    return localb;
  }
  
  public final a.a aih()
  {
    GMTrace.i(20417469218816L, 152122);
    a locala = new a();
    GMTrace.o(20417469218816L, 152122);
    return locala;
  }
  
  public static final class a
    implements a.a
  {
    public TextView jtq;
    
    public a()
    {
      GMTrace.i(10866401476608L, 80961);
      GMTrace.o(10866401476608L, 80961);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
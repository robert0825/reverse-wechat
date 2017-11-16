package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class e
  extends a
{
  private static a.b jtx;
  public long jtC;
  public String jtD;
  public String jva;
  public int vq;
  
  public e(Object paramObject, long paramLong, int paramInt, String paramString)
  {
    super(2, null);
    GMTrace.i(10876602023936L, 81037);
    this.jtC = paramLong;
    this.jtD = paramString;
    this.vq = paramInt;
    GMTrace.o(10876602023936L, 81037);
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(20421361532928L, 152151);
    this.jva = "";
    GMTrace.o(20421361532928L, 152151);
  }
  
  public final a.b aig()
  {
    GMTrace.i(20421093097472L, 152149);
    if (jtx == null) {
      jtx = new a.b()
      {
        public final void a(Context paramAnonymousContext, a.a paramAnonymousa, a paramAnonymousVarArgs)
        {
          GMTrace.i(20418408742912L, 152129);
          if ((paramAnonymousContext == null) || (paramAnonymousa == null) || (paramAnonymousVarArgs == null))
          {
            w.e("MicroMsg.ReadMoreBtnDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            GMTrace.o(20418408742912L, 152129);
            return;
          }
          if (!(paramAnonymousa instanceof e.a))
          {
            w.e("MicroMsg.ReadMoreBtnDataItem", "The ViewHolder is not a instance of MoreBtnViewHolder.");
            GMTrace.o(20418408742912L, 152129);
            return;
          }
          if (!(paramAnonymousVarArgs instanceof e))
          {
            w.e("MicroMsg.ReadMoreBtnDataItem", "The DataItem is not a instance of MoreBtnDataItem.");
            GMTrace.o(20418408742912L, 152129);
            return;
          }
          paramAnonymousContext = (e.a)paramAnonymousa;
          paramAnonymousa = (e)paramAnonymousVarArgs;
          paramAnonymousContext.iuc.setText(paramAnonymousa.jva);
          GMTrace.o(20418408742912L, 152129);
        }
        
        public final void a(View paramAnonymousView, a.a paramAnonymousa)
        {
          GMTrace.i(20418542960640L, 152130);
          if ((paramAnonymousView != null) && (paramAnonymousa != null) && ((paramAnonymousa instanceof e.a))) {
            ((e.a)paramAnonymousa).iuc = ((TextView)paramAnonymousView.findViewById(R.h.chC));
          }
          GMTrace.o(20418542960640L, 152130);
        }
        
        public final boolean a(Context paramAnonymousContext, a paramAnonymousa, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(20418274525184L, 152128);
          if ((paramAnonymousContext != null) && (paramAnonymousa != null))
          {
            int j = 0;
            int i = j;
            if (paramAnonymousVarArgs != null)
            {
              i = j;
              if (paramAnonymousVarArgs.length >= 2)
              {
                i = j;
                if ((paramAnonymousVarArgs[1] instanceof Integer)) {
                  i = ((Integer)paramAnonymousVarArgs[1]).intValue();
                }
              }
            }
            paramAnonymousa = (e)paramAnonymousa;
            paramAnonymousVarArgs = new Intent(paramAnonymousContext, BizSearchDetailPageUI.class);
            paramAnonymousVarArgs.putExtra("keyword", paramAnonymousa.jtD);
            paramAnonymousVarArgs.putExtra("businessType", paramAnonymousa.jtC);
            paramAnonymousVarArgs.putExtra("offset", paramAnonymousa.vq);
            paramAnonymousVarArgs.putExtra("showEditText", true);
            paramAnonymousVarArgs.putExtra("fromScene", i);
            paramAnonymousContext.startActivity(paramAnonymousVarArgs);
          }
          GMTrace.o(20418274525184L, 152128);
          return true;
        }
        
        public final View b(Context paramAnonymousContext, View paramAnonymousView)
        {
          GMTrace.i(10870428008448L, 80991);
          View localView = paramAnonymousView;
          if (paramAnonymousView == null) {
            localView = View.inflate(paramAnonymousContext, R.i.cFx, null);
          }
          GMTrace.o(10870428008448L, 80991);
          return localView;
        }
      };
    }
    a.b localb = jtx;
    GMTrace.o(20421093097472L, 152149);
    return localb;
  }
  
  public final a.a aih()
  {
    GMTrace.i(20421227315200L, 152150);
    a locala = new a();
    GMTrace.o(20421227315200L, 152150);
    return locala;
  }
  
  public static final class a
    implements a.a
  {
    public TextView iuc;
    
    public a()
    {
      GMTrace.i(10852845486080L, 80860);
      GMTrace.o(10852845486080L, 80860);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
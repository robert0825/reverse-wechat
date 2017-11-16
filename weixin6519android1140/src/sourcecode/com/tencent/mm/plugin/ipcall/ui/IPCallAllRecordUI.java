package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o;

public class IPCallAllRecordUI
  extends MMActivity
{
  private String eVo;
  private String eVq;
  private ListView moL;
  private boolean moM;
  
  public IPCallAllRecordUI()
  {
    GMTrace.i(11663654780928L, 86901);
    this.moM = false;
    GMTrace.o(11663654780928L, 86901);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11663788998656L, 86902);
    GMTrace.o(11663788998656L, 86902);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11664057434112L, 86904);
    int i = R.i.cAc;
    GMTrace.o(11664057434112L, 86904);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11663923216384L, 86903);
    super.onCreate(paramBundle);
    this.eVq = getIntent().getStringExtra("IPCallAllRecordUI_phoneNumber");
    this.eVo = getIntent().getStringExtra("IPCallAllRecordUI_contactId");
    this.moM = getIntent().getBooleanExtra("IPCallAllRecordUI_isSinglePhoneNumber", false);
    oM(R.l.dEI);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11653051580416L, 86822);
        IPCallAllRecordUI.this.finish();
        GMTrace.o(11653051580416L, 86822);
        return true;
      }
    });
    this.moL = ((ListView)findViewById(R.h.bdP));
    this.moL.setAdapter(new a(this));
    GMTrace.o(11663923216384L, 86903);
  }
  
  private final class a
    extends o<k>
  {
    public a(Context paramContext)
    {
      super(null);
      GMTrace.i(11729421467648L, 87391);
      lb(true);
      GMTrace.o(11729421467648L, 87391);
    }
    
    public final void QF()
    {
      Object localObject2 = null;
      GMTrace.i(11729555685376L, 87392);
      Object localObject1;
      if (!bg.nm(IPCallAllRecordUI.a(IPCallAllRecordUI.this)))
      {
        Object localObject3 = IPCallAllRecordUI.a(IPCallAllRecordUI.this);
        localObject1 = localObject2;
        if (!bg.nm((String)localObject3))
        {
          localObject3 = i.aIu().Ak((String)localObject3);
          localObject1 = localObject2;
          if (localObject3 != null)
          {
            localObject1 = localObject2;
            if (((com.tencent.mm.plugin.ipcall.a.g.c)localObject3).vmr != -1L)
            {
              long l = ((com.tencent.mm.plugin.ipcall.a.g.c)localObject3).vmr;
              localObject1 = i.aIv().cG(l);
            }
          }
        }
      }
      for (;;)
      {
        setCursor((Cursor)localObject1);
        GMTrace.o(11729555685376L, 87392);
        return;
        localObject1 = localObject2;
        if (!bg.nm(IPCallAllRecordUI.b(IPCallAllRecordUI.this))) {
          localObject1 = i.aIv().Ao(IPCallAllRecordUI.b(IPCallAllRecordUI.this));
        }
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(11729689903104L, 87393);
      aJe();
      QF();
      GMTrace.o(11729689903104L, 87393);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11729824120832L, 87394);
      View localView = paramView;
      if (paramView == null)
      {
        localView = IPCallAllRecordUI.this.getLayoutInflater().inflate(R.i.cAp, paramViewGroup, false);
        paramView = new a();
        paramView.moO = ((TextView)localView.findViewById(R.h.bUp));
        paramView.moP = ((TextView)localView.findViewById(R.h.bUr));
        paramView.hql = ((TextView)localView.findViewById(R.h.bUs));
        localView.setTag(paramView);
      }
      paramView = (k)getItem(paramInt);
      paramViewGroup = (a)localView.getTag();
      paramViewGroup.moP.setText(a.AP(paramView.field_phonenumber));
      if (paramView.field_duration > 0L) {
        paramViewGroup.hql.setText(com.tencent.mm.plugin.ipcall.b.c.cJ(paramView.field_duration));
      }
      for (;;)
      {
        paramViewGroup.moO.setText(com.tencent.mm.plugin.ipcall.b.c.cH(paramView.field_calltime));
        GMTrace.o(11729824120832L, 87394);
        return localView;
        paramViewGroup.hql.setText(com.tencent.mm.plugin.ipcall.b.c.pE(paramView.field_status));
      }
    }
    
    final class a
    {
      TextView hql;
      TextView moO;
      TextView moP;
      
      a()
      {
        GMTrace.i(11622718373888L, 86596);
        GMTrace.o(11622718373888L, 86596);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallAllRecordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
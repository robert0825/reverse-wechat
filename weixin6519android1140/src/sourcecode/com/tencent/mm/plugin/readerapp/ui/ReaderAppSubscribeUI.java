package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.api;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ReaderAppSubscribeUI
  extends MMActivity
{
  private ListView ocJ;
  private a ocK;
  
  public ReaderAppSubscribeUI()
  {
    GMTrace.i(11764318076928L, 87651);
    GMTrace.o(11764318076928L, 87651);
  }
  
  private void sZ(int paramInt)
  {
    GMTrace.i(11764989165568L, 87656);
    at.AR();
    c.xh().set(868518889, Integer.valueOf(paramInt));
    Object localObject = new api();
    ((api)localObject).uEW = paramInt;
    at.AR();
    c.yJ().b(new e.a(43, (com.tencent.mm.bm.a)localObject));
    localObject = new Intent();
    ((Intent)localObject).putExtra("Contact_User", "newsapp");
    ((Intent)localObject).addFlags(67108864);
    com.tencent.mm.plugin.readerapp.a.a.hnH.d((Intent)localObject, this);
    finish();
    GMTrace.o(11764989165568L, 87656);
  }
  
  protected final void MP()
  {
    GMTrace.i(11764720730112L, 87654);
    at.AR();
    this.ocK = new a(this, bg.e((Integer)c.xh().get(868518889, null)));
    this.ocJ = ((ListView)findViewById(R.h.bWN));
    this.ocJ.setAdapter(this.ocK);
    this.ocJ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        int i = 1;
        GMTrace.i(11754520182784L, 87578);
        paramAnonymousAdapterView = ReaderAppSubscribeUI.a(ReaderAppSubscribeUI.this);
        if ((paramAnonymousAdapterView.ocN & paramAnonymousAdapterView.ocM[paramAnonymousInt]) != 0)
        {
          paramAnonymousAdapterView.ocN &= (paramAnonymousAdapterView.ocM[paramAnonymousInt] ^ 0xFFFFFFFF);
          paramAnonymousAdapterView.ocP -= 1;
          if (paramAnonymousAdapterView.ocP < 0) {
            paramAnonymousAdapterView.ocP = 0;
          }
          paramAnonymousAdapterView.notifyDataSetChanged();
          paramAnonymousInt = i;
        }
        for (;;)
        {
          if (paramAnonymousInt == 0) {
            h.h(ReaderAppSubscribeUI.this, R.l.dks, R.l.cUG);
          }
          GMTrace.o(11754520182784L, 87578);
          return;
          if (paramAnonymousAdapterView.ocP < 3)
          {
            paramAnonymousAdapterView.ocN |= paramAnonymousAdapterView.ocM[paramAnonymousInt];
            paramAnonymousAdapterView.ocP += 1;
            if (paramAnonymousAdapterView.ocP > paramAnonymousAdapterView.ocM.length) {
              paramAnonymousAdapterView.ocP = paramAnonymousAdapterView.ocM.length;
            }
            paramAnonymousAdapterView.notifyDataSetChanged();
            paramAnonymousInt = i;
          }
          else
          {
            paramAnonymousInt = 0;
          }
        }
      }
    });
    this.ocK.notifyDataSetChanged();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11752775352320L, 87565);
        ReaderAppSubscribeUI.a(ReaderAppSubscribeUI.this, ReaderAppSubscribeUI.a(ReaderAppSubscribeUI.this).ocN);
        GMTrace.o(11752775352320L, 87565);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11750627868672L, 87549);
        BackwardSupportUtil.c.a(ReaderAppSubscribeUI.b(ReaderAppSubscribeUI.this));
        GMTrace.o(11750627868672L, 87549);
      }
    };
    GMTrace.o(11764720730112L, 87654);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11764452294656L, 87652);
    int i = R.i.cEv;
    GMTrace.o(11764452294656L, 87652);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11764586512384L, 87653);
    super.onCreate(paramBundle);
    at.AR();
    c.xh().set(868518890, "in");
    oM(R.l.dkr);
    MP();
    GMTrace.o(11764586512384L, 87653);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11764854947840L, 87655);
    if (paramInt == 4)
    {
      if (this.ocK != null) {
        sZ(this.ocK.ocN);
      }
      GMTrace.o(11764854947840L, 87655);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11764854947840L, 87655);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(11765123383296L, 87657);
    super.onResume();
    this.ocK.notifyDataSetChanged();
    GMTrace.o(11765123383296L, 87657);
  }
  
  static final class a
    extends BaseAdapter
  {
    private final Context context;
    final int[] ocM;
    int ocN;
    private String[] ocO;
    int ocP;
    
    public a(Context paramContext, int paramInt)
    {
      GMTrace.i(11751835828224L, 87558);
      this.ocM = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192 };
      this.ocO = null;
      this.ocP = 0;
      this.context = paramContext;
      this.ocN = paramInt;
      this.ocO = paramContext.getString(R.l.dPP).split(";");
      this.ocP = ta(paramInt);
      GMTrace.o(11751835828224L, 87558);
    }
    
    private int ta(int paramInt)
    {
      int i = 0;
      GMTrace.i(11752372699136L, 87562);
      int k;
      for (int j = 0; i < this.ocM.length; j = k)
      {
        k = j;
        if ((this.ocM[i] & paramInt) != 0) {
          k = j + 1;
        }
        i += 1;
      }
      GMTrace.o(11752372699136L, 87562);
      return j;
    }
    
    public final int getCount()
    {
      GMTrace.i(11751970045952L, 87559);
      int i = this.ocO.length;
      GMTrace.o(11751970045952L, 87559);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11752238481408L, 87561);
      long l = paramInt;
      GMTrace.o(11752238481408L, 87561);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11752104263680L, 87560);
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cEu, null);
        paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bWM));
        paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.bWL));
        paramView.setTag(paramViewGroup);
        paramViewGroup.hqH.setText(this.ocO[paramInt]);
        paramViewGroup = paramViewGroup.hqJ;
        if ((this.ocN & this.ocM[paramInt]) == 0) {
          break label127;
        }
      }
      label127:
      for (boolean bool = true;; bool = false)
      {
        paramViewGroup.setChecked(bool);
        GMTrace.o(11752104263680L, 87560);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
      }
    }
    
    static final class a
    {
      TextView hqH;
      CheckBox hqJ;
      
      a()
      {
        GMTrace.i(11758144061440L, 87605);
        GMTrace.o(11758144061440L, 87605);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\ReaderAppSubscribeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
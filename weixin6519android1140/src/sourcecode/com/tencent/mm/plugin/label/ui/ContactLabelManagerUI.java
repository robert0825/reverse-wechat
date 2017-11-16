package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.label.b.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;

public class ContactLabelManagerUI
  extends ContactLabelBaseUI
  implements View.OnCreateContextMenuListener, AdapterView.OnItemClickListener, com.tencent.mm.ad.e, p.d
{
  private ListView Ev;
  private int QF;
  private int juH;
  private int juI;
  private com.tencent.mm.ui.widget.h juL;
  private View kpD;
  private ae mHandler;
  private b mvj;
  private View mvk;
  private View mvl;
  private a mvm;
  private ArrayList<z> mvn;
  private HashMap<Integer, Integer> mvo;
  private boolean mvp;
  private View.OnClickListener mvq;
  private j.a mvr;
  private m.b mvs;
  
  public ContactLabelManagerUI()
  {
    GMTrace.i(7289767460864L, 54313);
    this.mvj = b.mvy;
    this.juH = 0;
    this.juI = 0;
    this.mvn = new ArrayList();
    this.mvo = new HashMap();
    this.mvp = true;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7285069840384L, 54278);
        int i = paramAnonymousMessage.what;
        w.d("MicroMsg.Label.ContactLabelManagerUI", "handleMessage:%d", new Object[] { Integer.valueOf(i) });
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(7285069840384L, 54278);
          return;
          ContactLabelManagerUI.a(ContactLabelManagerUI.this);
          GMTrace.o(7285069840384L, 54278);
          return;
          ContactLabelManagerUI.this.AZ(ContactLabelManagerUI.this.getString(R.l.cUV));
          GMTrace.o(7285069840384L, 54278);
          return;
          ContactLabelManagerUI.this.aJR();
        }
      }
    };
    this.mvq = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7298491613184L, 54378);
        ContactLabelManagerUI.b(ContactLabelManagerUI.this);
        GMTrace.o(7298491613184L, 54378);
      }
    };
    this.mvr = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(7315805700096L, 54507);
        if (!bg.nm(paramAnonymousString)) {
          ContactLabelManagerUI.a(ContactLabelManagerUI.this);
        }
        GMTrace.o(7315805700096L, 54507);
      }
    };
    this.mvs = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(7285875146752L, 54284);
        w.d("MicroMsg.Label.ContactLabelManagerUI", "event:%d, obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousObject });
        if (ContactLabelManagerUI.c(ContactLabelManagerUI.this) != null)
        {
          ContactLabelManagerUI.c(ContactLabelManagerUI.this).removeMessages(5001);
          ContactLabelManagerUI.c(ContactLabelManagerUI.this).sendEmptyMessageDelayed(5001, 400L);
        }
        GMTrace.o(7285875146752L, 54284);
      }
    };
    GMTrace.o(7289767460864L, 54313);
  }
  
  private void Bd(String paramString)
  {
    GMTrace.i(7291512291328L, 54326);
    if (!com.tencent.mm.plugin.label.e.aJO().hB(paramString))
    {
      w.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteContactLabel] fail.");
      aJW();
      GMTrace.o(7291512291328L, 54326);
      return;
    }
    aJR();
    fA(false);
    GMTrace.o(7291512291328L, 54326);
  }
  
  private void aJW()
  {
    GMTrace.i(7291646509056L, 54327);
    aJR();
    wr(getString(R.l.dmx));
    GMTrace.o(7291646509056L, 54327);
  }
  
  private void fA(final boolean paramBoolean)
  {
    try
    {
      GMTrace.i(7291243855872L, 54324);
      w.d("MicroMsg.Label.ContactLabelManagerUI", "loading%s", new Object[] { String.valueOf(paramBoolean) });
      if ((paramBoolean) && (this.mHandler != null)) {
        this.mHandler.sendEmptyMessageDelayed(5002, 400L);
      }
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16039018496000L, 119500);
          ContactLabelManagerUI.a(ContactLabelManagerUI.this, com.tencent.mm.plugin.label.e.aJO().bSH());
          if ((ContactLabelManagerUI.g(ContactLabelManagerUI.this) == null) || (ContactLabelManagerUI.g(ContactLabelManagerUI.this).size() <= 0))
          {
            w.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Empty");
            if (ContactLabelManagerUI.h(ContactLabelManagerUI.this))
            {
              g.ork.i(11346, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
              ContactLabelManagerUI.i(ContactLabelManagerUI.this);
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16038481625088L, 119496);
                ContactLabelManagerUI.a(ContactLabelManagerUI.this, ContactLabelManagerUI.b.mvz);
                if ((ContactLabelManagerUI.4.this.mvv) && (ContactLabelManagerUI.c(ContactLabelManagerUI.this) != null))
                {
                  ContactLabelManagerUI.c(ContactLabelManagerUI.this).removeMessages(5002);
                  ContactLabelManagerUI.c(ContactLabelManagerUI.this).sendEmptyMessageDelayed(5003, 0L);
                }
                GMTrace.o(16038481625088L, 119496);
              }
            });
            GMTrace.o(16039018496000L, 119500);
            return;
          }
          w.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Normal");
          if (ContactLabelManagerUI.h(ContactLabelManagerUI.this))
          {
            g.ork.i(11346, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
            ContactLabelManagerUI.i(ContactLabelManagerUI.this);
          }
          if ((ContactLabelManagerUI.g(ContactLabelManagerUI.this) != null) && (ContactLabelManagerUI.g(ContactLabelManagerUI.this).size() > 0))
          {
            int j = ContactLabelManagerUI.g(ContactLabelManagerUI.this).size();
            com.tencent.mm.plugin.label.e.aJO().aJJ();
            int i = 0;
            if (i < j)
            {
              int k = ((z)ContactLabelManagerUI.g(ContactLabelManagerUI.this).get(i)).field_labelID;
              ArrayList localArrayList = com.tencent.mm.plugin.label.e.aJO().Tu(String.valueOf(k));
              if ((localArrayList != null) && (localArrayList.size() > 0)) {
                ContactLabelManagerUI.j(ContactLabelManagerUI.this).put(Integer.valueOf(k), Integer.valueOf(localArrayList.size()));
              }
              for (;;)
              {
                i += 1;
                break;
                ContactLabelManagerUI.j(ContactLabelManagerUI.this).put(Integer.valueOf(k), Integer.valueOf(0));
              }
            }
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16038750060544L, 119498);
              ContactLabelManagerUI.a(ContactLabelManagerUI.this, ContactLabelManagerUI.b.mvy);
              ContactLabelManagerUI.a locala = ContactLabelManagerUI.k(ContactLabelManagerUI.this);
              locala.mData = ContactLabelManagerUI.g(ContactLabelManagerUI.this);
              locala.notifyDataSetChanged();
              ContactLabelManagerUI.k(ContactLabelManagerUI.this).notifyDataSetInvalidated();
              if ((ContactLabelManagerUI.4.this.mvv) && (ContactLabelManagerUI.c(ContactLabelManagerUI.this) != null))
              {
                ContactLabelManagerUI.c(ContactLabelManagerUI.this).removeMessages(5002);
                ContactLabelManagerUI.c(ContactLabelManagerUI.this).sendEmptyMessageDelayed(5003, 400L);
              }
              GMTrace.o(16038750060544L, 119498);
            }
          });
          GMTrace.o(16039018496000L, 119500);
        }
        
        public final String toString()
        {
          GMTrace.i(16039152713728L, 119501);
          String str = super.toString() + "|updateData";
          GMTrace.o(16039152713728L, 119501);
          return str;
        }
      });
      GMTrace.o(7291243855872L, 54324);
      return;
    }
    finally {}
  }
  
  protected final void MP()
  {
    GMTrace.i(7290035896320L, 54315);
    this.QF = a.V(this.vKB.vKW, R.f.aQF);
    sq(getString(R.l.dFZ));
    a(0, getString(R.l.dGf), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7286546235392L, 54289);
        ContactLabelManagerUI.b(ContactLabelManagerUI.this);
        GMTrace.o(7286546235392L, 54289);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7301041750016L, 54397);
        ContactLabelManagerUI.this.finish();
        GMTrace.o(7301041750016L, 54397);
        return false;
      }
    });
    this.mvm = new a();
    this.kpD = findViewById(R.h.bJv);
    this.mvk = findViewById(R.h.bJp);
    this.mvl = findViewById(R.h.bJw);
    this.mvl.setOnClickListener(this.mvq);
    this.Ev = ((ListView)findViewById(R.h.bJu));
    this.juL = new com.tencent.mm.ui.widget.h(this);
    this.Ev.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16040226455552L, 119509);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          ContactLabelManagerUI.a(ContactLabelManagerUI.this, (int)paramAnonymousMotionEvent.getRawX());
          ContactLabelManagerUI.b(ContactLabelManagerUI.this, (int)paramAnonymousMotionEvent.getRawY());
        }
        GMTrace.o(16040226455552L, 119509);
        return false;
      }
    });
    this.Ev.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(16039689584640L, 119505);
        ContactLabelManagerUI.f(ContactLabelManagerUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ContactLabelManagerUI.this, ContactLabelManagerUI.this, ContactLabelManagerUI.d(ContactLabelManagerUI.this), ContactLabelManagerUI.e(ContactLabelManagerUI.this));
        GMTrace.o(16039689584640L, 119505);
        return true;
      }
    });
    this.Ev.setAdapter(this.mvm);
    this.Ev.setOnItemClickListener(this);
    GMTrace.o(7290035896320L, 54315);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7291109638144L, 54323);
    w.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    default: 
      w.w("MicroMsg.Label.ContactLabelManagerUI", "unknow type.");
      GMTrace.o(7291109638144L, 54323);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      Bd(((b)paramk).muO);
      GMTrace.o(7291109638144L, 54323);
      return;
    }
    w.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd] delete fail.");
    aJW();
    GMTrace.o(7291109638144L, 54323);
  }
  
  public final void c(final MenuItem paramMenuItem, int paramInt)
  {
    GMTrace.i(7290975420416L, 54322);
    int i = ((AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo()).position;
    if ((this.mvm != null) && (i >= 0))
    {
      paramMenuItem = this.mvm.pF(i);
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(7290975420416L, 54322);
      return;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dGa), "", getString(R.l.cSt), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16039421149184L, 119503);
          if (paramMenuItem != null)
          {
            if (paramMenuItem.field_isTemporary)
            {
              ContactLabelManagerUI.a(ContactLabelManagerUI.this, paramMenuItem.field_labelID);
              GMTrace.o(16039421149184L, 119503);
              return;
            }
            ContactLabelManagerUI.a(ContactLabelManagerUI.this, paramMenuItem);
          }
          GMTrace.o(16039421149184L, 119503);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16039958020096L, 119507);
          GMTrace.o(16039958020096L, 119507);
        }
      });
      GMTrace.o(7290975420416L, 54322);
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(this, ContactLabelEditUI.class);
      localIntent.putExtra("label_id", paramMenuItem.field_labelID);
      localIntent.putExtra("label_name", paramMenuItem.field_labelName);
      startActivity(localIntent);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7289901678592L, 54314);
    int i = R.i.ctO;
    GMTrace.o(7289901678592L, 54314);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7291378073600L, 54325);
    w.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] requestCode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      GMTrace.o(7291378073600L, 54325);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(7291378073600L, 54325);
      return;
      String str = paramIntent.getStringExtra("Select_Contact");
      w.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", new Object[] { str });
      if (!bg.nm(str))
      {
        Intent localIntent = new Intent();
        localIntent.setClass(this, ContactLabelEditUI.class);
        localIntent.putExtra("Select_Contact", str);
        startActivity(localIntent);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7290170114048L, 54316);
    super.onCreate(paramBundle);
    MP();
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16038213189632L, 119494);
        at.wS().a(new com.tencent.mm.plugin.label.b.c(), 0);
        GMTrace.o(16038213189632L, 119494);
      }
    });
    com.tencent.mm.plugin.label.e.aJO().c(this.mvr);
    GMTrace.o(7290170114048L, 54316);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(7290841202688L, 54321);
    int i = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).position;
    if ((this.mvm != null) && (i >= 0))
    {
      z localz = this.mvm.pF(i);
      if (localz != null)
      {
        paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(paramView.getContext(), localz.field_labelName));
        paramContextMenu.add(0, 0, 0, getString(R.l.cSt));
        paramContextMenu.add(0, 1, 1, getString(R.l.cSC));
      }
    }
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    GMTrace.o(7290841202688L, 54321);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7290572767232L, 54319);
    com.tencent.mm.plugin.label.e.aJO().j(this.mvr);
    super.onDestroy();
    GMTrace.o(7290572767232L, 54319);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(7290706984960L, 54320);
    if ((this.mvm != null) && (paramInt >= 0))
    {
      paramView = this.mvm.pF(paramInt);
      if (paramView != null)
      {
        paramAdapterView = paramView.field_labelID;
        paramView = paramView.field_labelName;
        Intent localIntent = new Intent();
        localIntent.putExtra("label_id", paramAdapterView);
        localIntent.putExtra("label_name", paramView);
        localIntent.setClass(this, ContactLabelEditUI.class);
        startActivity(localIntent);
        if (bg.nm(paramAdapterView))
        {
          if ((this.mvn == null) || (this.mvn.isEmpty()))
          {
            g.ork.i(11347, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
            GMTrace.o(7290706984960L, 54320);
            return;
          }
          g.ork.i(11347, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
        }
      }
    }
    GMTrace.o(7290706984960L, 54320);
  }
  
  protected void onPause()
  {
    GMTrace.i(7290438549504L, 54318);
    at.wS().b(636, this);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.mvs);
    super.onPause();
    GMTrace.o(7290438549504L, 54318);
  }
  
  protected void onResume()
  {
    GMTrace.i(7290304331776L, 54317);
    at.wS().a(636, this);
    at.AR();
    com.tencent.mm.y.c.yK().a(this.mvs);
    fA(true);
    super.onResume();
    GMTrace.o(7290304331776L, 54317);
  }
  
  final class a
    extends BaseAdapter
  {
    ArrayList<z> mData;
    
    a()
    {
      GMTrace.i(7297552089088L, 54371);
      GMTrace.o(7297552089088L, 54371);
    }
    
    public final int getCount()
    {
      GMTrace.i(7297686306816L, 54372);
      if (this.mData == null)
      {
        GMTrace.o(7297686306816L, 54372);
        return 0;
      }
      int i = this.mData.size();
      GMTrace.o(7297686306816L, 54372);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7297954742272L, 54374);
      long l = paramInt;
      GMTrace.o(7297954742272L, 54374);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7298088960000L, 54375);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(ContactLabelManagerUI.this).inflate(R.i.ctN, paramViewGroup, false);
        paramViewGroup = new c(paramView);
        Object localObject = paramViewGroup.mwq.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)(a.W(ContactLabelManagerUI.this, R.f.aQM) * a.ec(ContactLabelManagerUI.this)));
        paramViewGroup.mwq.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramView.setTag(paramViewGroup);
        localObject = pF(paramInt);
        SpannableString localSpannableString = com.tencent.mm.pluginsdk.ui.d.h.c(ContactLabelManagerUI.this.vKB.vKW, ((z)localObject).field_labelName, ContactLabelManagerUI.l(ContactLabelManagerUI.this));
        paramViewGroup.mwo.setText(localSpannableString);
        if ((ContactLabelManagerUI.j(ContactLabelManagerUI.this) == null) || (!ContactLabelManagerUI.j(ContactLabelManagerUI.this).containsKey(Integer.valueOf(((z)localObject).field_labelID)))) {
          break label240;
        }
        paramViewGroup.mwp.setVisibility(0);
        paramViewGroup.mwp.setText("(" + ContactLabelManagerUI.j(ContactLabelManagerUI.this).get(Integer.valueOf(((z)localObject).field_labelID)) + ")");
      }
      for (;;)
      {
        GMTrace.o(7298088960000L, 54375);
        return paramView;
        paramViewGroup = (c)paramView.getTag();
        break;
        label240:
        paramViewGroup.mwp.setVisibility(0);
        paramViewGroup.mwp.setText("(0)");
      }
    }
    
    public final z pF(int paramInt)
    {
      GMTrace.i(7297820524544L, 54373);
      if ((this.mData == null) || (paramInt > this.mData.size()))
      {
        GMTrace.o(7297820524544L, 54373);
        return null;
      }
      z localz = (z)this.mData.get(paramInt);
      GMTrace.o(7297820524544L, 54373);
      return localz;
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(7317013659648L, 54516);
      mvy = new b("Normal", 0);
      mvz = new b("Empty", 1);
      mvA = new b[] { mvy, mvz };
      GMTrace.o(7317013659648L, 54516);
    }
    
    private b()
    {
      GMTrace.i(7316879441920L, 54515);
      GMTrace.o(7316879441920L, 54515);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\ContactLabelManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
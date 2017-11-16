package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.qqmail.b.a;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.j;
import com.tencent.mm.plugin.qqmail.b.j.a;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.tools.p.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MailAddrListUI
  extends MMActivity
{
  private j nSQ;
  private ListView nWA;
  private a nWB;
  private List<i> nWC;
  private j.a nWD;
  private r nWx;
  private TextView nWy;
  private TextView nWz;
  
  public MailAddrListUI()
  {
    GMTrace.i(5495008002048L, 40941);
    this.nWx = null;
    this.nWy = null;
    this.nWz = null;
    this.nSQ = null;
    this.nWD = new j.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5499974057984L, 40978);
        if (MailAddrListUI.a(MailAddrListUI.this) != null) {
          MailAddrListUI.a(MailAddrListUI.this).dismiss();
        }
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).EW(null));
        if (MailAddrListUI.c(MailAddrListUI.this).size() == 0)
        {
          MailAddrListUI.d(MailAddrListUI.this).setText(R.l.eal);
          MailAddrListUI.d(MailAddrListUI.this).setVisibility(0);
        }
        Object localObject1 = MailAddrListUI.this.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
        if (localObject1 == null) {
          localObject1 = new String[] { "" };
        }
        for (;;)
        {
          int k = localObject1.length;
          int i = 0;
          Object localObject2;
          Object localObject3;
          if (i < k)
          {
            localObject2 = j.EX(localObject1[i]);
            if (localObject2 != null)
            {
              localObject3 = MailAddrListUI.c(MailAddrListUI.this).iterator();
              while (((Iterator)localObject3).hasNext())
              {
                i locali = (i)((Iterator)localObject3).next();
                if (locali.mwD.equalsIgnoreCase(((i)localObject2).mwD)) {
                  MailAddrListUI.e(MailAddrListUI.this).c(locali);
                }
              }
            }
          }
          for (int j = 1;; j = 0)
          {
            if (j == 0) {
              MailAddrListUI.e(MailAddrListUI.this).c((i)localObject2);
            }
            i += 1;
            break;
            localObject2 = MailAddrListUI.this;
            localObject3 = new StringBuilder().append(MailAddrListUI.this.getString(R.l.dNK));
            if (MailAddrListUI.e(MailAddrListUI.this).aZg() > 0) {}
            for (localObject1 = "(" + MailAddrListUI.e(MailAddrListUI.this).aZg() + ")";; localObject1 = "")
            {
              ((MailAddrListUI)localObject2).sq((String)localObject1);
              MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
              GMTrace.o(5499974057984L, 40978);
              return;
            }
          }
        }
      }
    };
    GMTrace.o(5495008002048L, 40941);
  }
  
  protected final void MP()
  {
    GMTrace.i(5495410655232L, 40944);
    this.nWA = ((ListView)findViewById(R.h.bUY));
    this.nWy = ((TextView)findViewById(R.h.bwL));
    this.nWz = ((TextView)findViewById(R.h.bRj));
    this.nWB = new a(this);
    Object localObject = new com.tencent.mm.ui.tools.p(true, true);
    ((com.tencent.mm.ui.tools.p)localObject).xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(5557553463296L, 41407);
        GMTrace.o(5557553463296L, 41407);
      }
      
      public final void QB()
      {
        GMTrace.i(17265097441280L, 128635);
        GMTrace.o(17265097441280L, 128635);
      }
      
      public final void Qy()
      {
        GMTrace.i(5557956116480L, 41410);
        GMTrace.o(5557956116480L, 41410);
      }
      
      public final void Qz()
      {
        GMTrace.i(5558090334208L, 41411);
        GMTrace.o(5558090334208L, 41411);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(5557687681024L, 41408);
        GMTrace.o(5557687681024L, 41408);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(5557821898752L, 41409);
        paramAnonymousString = bg.aq(paramAnonymousString, "");
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).EW(paramAnonymousString.toLowerCase().trim()));
        if (paramAnonymousString.length() > 0)
        {
          MailAddrListUI.e(MailAddrListUI.this).nWG = true;
          MailAddrListUI.e(MailAddrListUI.this).nWF = false;
          if (MailAddrListUI.c(MailAddrListUI.this).size() != 0) {
            break label136;
          }
          MailAddrListUI.this.lf(false);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(0);
        }
        for (;;)
        {
          MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
          GMTrace.o(5557821898752L, 41409);
          return;
          MailAddrListUI.e(MailAddrListUI.this).nWG = false;
          break;
          label136:
          MailAddrListUI.this.lf(true);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(8);
        }
      }
    };
    a((com.tencent.mm.ui.tools.p)localObject);
    this.nWA.setAdapter(this.nWB);
    this.nWA.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5561714212864L, 41438);
        paramAnonymousAdapterView = MailAddrListUI.e(MailAddrListUI.this);
        paramAnonymousView = paramAnonymousAdapterView.sV(paramAnonymousInt - MailAddrListUI.g(MailAddrListUI.this).getHeaderViewsCount());
        Object localObject = paramAnonymousView.mwD;
        if (paramAnonymousAdapterView.nWH.containsKey(localObject))
        {
          paramAnonymousAdapterView.nWH.remove(localObject);
          paramAnonymousAdapterView.notifyDataSetChanged();
          paramAnonymousView = MailAddrListUI.this;
          localObject = new StringBuilder().append(MailAddrListUI.this.getString(R.l.dNK));
          if (MailAddrListUI.e(MailAddrListUI.this).aZg() <= 0) {
            break label178;
          }
        }
        label178:
        for (paramAnonymousAdapterView = "(" + MailAddrListUI.e(MailAddrListUI.this).aZg() + ")";; paramAnonymousAdapterView = "")
        {
          paramAnonymousView.sq(paramAnonymousAdapterView);
          GMTrace.o(5561714212864L, 41438);
          return;
          paramAnonymousAdapterView.nWH.put(localObject, paramAnonymousView);
          break;
        }
      }
    });
    this.nWA.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5491920994304L, 40918);
        GMTrace.o(5491920994304L, 40918);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5491786776576L, 40917);
        if (1 == paramAnonymousInt) {
          MailAddrListUI.this.aLo();
        }
        GMTrace.o(5491786776576L, 40917);
      }
    });
    this.nWC = this.nSQ.EW(null);
    this.nWB.notifyDataSetChanged();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5494873784320L, 40940);
        MailAddrListUI.this.setResult(0);
        MailAddrListUI.this.finish();
        GMTrace.o(5494873784320L, 40940);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5547621351424L, 41333);
        BackwardSupportUtil.c.a(MailAddrListUI.g(MailAddrListUI.this));
        GMTrace.o(5547621351424L, 41333);
      }
    };
    a(0, getString(R.l.dNJ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5500779364352L, 40984);
        paramAnonymousMenuItem = MailAddrListUI.e(MailAddrListUI.this);
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramAnonymousMenuItem.nWH.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localArrayList.add(paramAnonymousMenuItem.nWH.get(str));
        }
        ComposeUI.bf(localArrayList);
        MailAddrListUI.this.setResult(-1);
        MailAddrListUI.this.finish();
        GMTrace.o(5500779364352L, 40984);
        return true;
      }
    });
    if (!this.nWC.isEmpty()) {}
    for (boolean bool = true;; bool = false)
    {
      lf(bool);
      localObject = this.vKB.vKW;
      getString(R.l.cUG);
      this.nWx = h.a((Context)localObject, getString(R.l.dNI), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(5557285027840L, 41405);
          GMTrace.o(5557285027840L, 41405);
        }
      });
      GMTrace.o(5495410655232L, 40944);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5495142219776L, 40942);
    int i = R.i.cDV;
    GMTrace.o(5495142219776L, 40942);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5495276437504L, 40943);
    super.onCreate(paramBundle);
    oM(R.l.dNK);
    this.nWC = new ArrayList();
    this.nSQ = w.aYE().nSQ;
    MP();
    this.nSQ.a(this.nWD);
    this.nSQ.aYu();
    GMTrace.o(5495276437504L, 40943);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5495813308416L, 40947);
    super.onDestroy();
    this.nSQ.b(this.nWD);
    GMTrace.o(5495813308416L, 40947);
  }
  
  protected void onPause()
  {
    GMTrace.i(5495544872960L, 40945);
    super.onPause();
    GMTrace.o(5495544872960L, 40945);
  }
  
  protected void onResume()
  {
    GMTrace.i(5495679090688L, 40946);
    super.onResume();
    this.nWB.notifyDataSetChanged();
    GMTrace.o(5495679090688L, 40946);
  }
  
  final class a
    extends BaseAdapter
  {
    private final Context context;
    boolean nWF;
    boolean nWG;
    Map<String, i> nWH;
    
    public a(Context paramContext)
    {
      GMTrace.i(5509100863488L, 41046);
      this.nWF = false;
      this.nWG = false;
      this.nWH = new HashMap();
      this.context = paramContext;
      GMTrace.o(5509100863488L, 41046);
    }
    
    private TextView aZh()
    {
      GMTrace.i(5509637734400L, 41050);
      TextView localTextView = new TextView(this.context);
      localTextView.setBackgroundResource(R.g.aXD);
      localTextView.setTextColor(-16777216);
      localTextView.setTextSize(0, MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aQo));
      int i = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aQq);
      int j = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aQN);
      localTextView.setPadding(j, i, j, j);
      GMTrace.o(5509637734400L, 41050);
      return localTextView;
    }
    
    private static String d(i parami)
    {
      GMTrace.i(5509906169856L, 41052);
      if (parami == null)
      {
        GMTrace.o(5509906169856L, 41052);
        return null;
      }
      parami = a.ES(parami.nSu);
      if (parami.length() > 1) {}
      for (char c = parami.charAt(0);; c = '~') {
        switch (c)
        {
        case '|': 
        case '}': 
        default: 
          if (!bg.k(c)) {
            break label150;
          }
          GMTrace.o(5509906169856L, 41052);
          return String.valueOf(c);
        }
      }
      c = parami.charAt(1);
      if (bg.l(c))
      {
        GMTrace.o(5509906169856L, 41052);
        return String.valueOf(c);
      }
      GMTrace.o(5509906169856L, 41052);
      return "~";
      GMTrace.o(5509906169856L, 41052);
      return "~";
      label150:
      GMTrace.o(5509906169856L, 41052);
      return "~";
    }
    
    public final int aZg()
    {
      GMTrace.i(5509369298944L, 41048);
      int i = this.nWH.size();
      GMTrace.o(5509369298944L, 41048);
      return i;
    }
    
    public final boolean areAllItemsEnabled()
    {
      GMTrace.i(5510308823040L, 41055);
      GMTrace.o(5510308823040L, 41055);
      return false;
    }
    
    public final void c(i parami)
    {
      GMTrace.i(5509235081216L, 41047);
      this.nWH.put(parami.mwD, parami);
      GMTrace.o(5509235081216L, 41047);
    }
    
    public final int getCount()
    {
      GMTrace.i(5509503516672L, 41049);
      int i = MailAddrListUI.c(MailAddrListUI.this).size();
      if (i == 0)
      {
        if (this.nWF)
        {
          GMTrace.o(5509503516672L, 41049);
          return 1;
        }
        GMTrace.o(5509503516672L, 41049);
        return 0;
      }
      if (this.nWG)
      {
        GMTrace.o(5509503516672L, 41049);
        return i;
      }
      GMTrace.o(5509503516672L, 41049);
      return i + 1;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5510174605312L, 41054);
      GMTrace.o(5510174605312L, 41054);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5509771952128L, 41051);
      if (paramInt == 0)
      {
        if (this.nWF)
        {
          paramView = aZh();
          paramView.setText(R.l.dNR);
          paramInt = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aQq);
          paramView.setPadding(paramInt, paramInt, paramInt, paramInt);
          paramView.setTextSize(0, MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aPz));
          paramView.setGravity(17);
          GMTrace.o(5509771952128L, 41051);
          return paramView;
        }
        if (!this.nWG)
        {
          paramView = aZh();
          paramView.setText(R.l.dNQ);
          GMTrace.o(5509771952128L, 41051);
          return paramView;
        }
      }
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cDW, null);
        paramViewGroup.nWI = ((TextView)paramView.findViewById(R.h.bUV));
        paramViewGroup.jUm = ((TextView)paramView.findViewById(R.h.bUW));
        paramViewGroup.nWJ = ((TextView)paramView.findViewById(R.h.bUU));
        paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.bUX));
        paramView.setTag(paramViewGroup);
        i locali = sV(paramInt);
        if ((this.nWG) || (paramInt <= 10)) {
          break label397;
        }
        Object localObject = sV(paramInt - 1);
        if (paramInt == 11) {
          localObject = null;
        }
        String str = d(locali);
        localObject = d((i)localObject);
        if (str == null) {
          break label385;
        }
        if (str.equals(localObject)) {
          break label373;
        }
        paramViewGroup.nWI.setText(str.toUpperCase());
        paramViewGroup.nWI.setVisibility(0);
        label297:
        paramViewGroup.jUm.setText(locali.name);
        paramViewGroup.nWJ.setText(locali.mwD);
        paramViewGroup = paramViewGroup.hqJ;
        if (this.nWH.get(locali.mwD) == null) {
          break label409;
        }
      }
      label373:
      label385:
      label397:
      label409:
      for (boolean bool = true;; bool = false)
      {
        paramViewGroup.setChecked(bool);
        GMTrace.o(5509771952128L, 41051);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        paramViewGroup.nWI.setVisibility(8);
        break label297;
        paramViewGroup.nWI.setVisibility(8);
        break label297;
        paramViewGroup.nWI.setVisibility(8);
        break label297;
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(5510443040768L, 41056);
      if (paramInt == 0)
      {
        boolean bool = this.nWG;
        GMTrace.o(5510443040768L, 41056);
        return bool;
      }
      GMTrace.o(5510443040768L, 41056);
      return true;
    }
    
    public final i sV(int paramInt)
    {
      GMTrace.i(5510040387584L, 41053);
      if (this.nWG) {}
      for (;;)
      {
        i locali = (i)MailAddrListUI.c(MailAddrListUI.this).get(paramInt);
        GMTrace.o(5510040387584L, 41053);
        return locali;
        if (paramInt == 0) {
          paramInt = 0;
        } else {
          paramInt -= 1;
        }
      }
    }
    
    final class a
    {
      CheckBox hqJ;
      TextView jUm;
      TextView nWI;
      TextView nWJ;
      
      a()
      {
        GMTrace.i(5508966645760L, 41045);
        GMTrace.o(5508966645760L, 41045);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailAddrListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelfriend.v;
import com.tencent.mm.plugin.accountsync.ui.InviteFacebookFriendsUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

@Deprecated
public class FacebookFriendUI
  extends MMActivity
  implements com.tencent.mm.ac.d.a, e
{
  private ListView htD;
  private View htF;
  private ProgressDialog htG;
  String htH;
  private boolean mDI;
  d vPM;
  private TextView vPN;
  
  public FacebookFriendUI()
  {
    GMTrace.i(2687038914560L, 20020);
    this.htG = null;
    this.vPN = null;
    this.mDI = false;
    GMTrace.o(2687038914560L, 20020);
  }
  
  private void aw(String paramString1, String paramString2)
  {
    GMTrace.i(2688112656384L, 20028);
    com.tencent.mm.ui.base.h.a(this, paramString2, paramString1, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(2725022531584L, 20303);
        paramAnonymousDialogInterface = new Intent(FacebookFriendUI.this.vKB.vKW, FacebookAuthUI.class);
        paramAnonymousDialogInterface.putExtra("is_force_unbind", true);
        FacebookFriendUI.this.vKB.vKW.startActivity(paramAnonymousDialogInterface);
        FacebookFriendUI.this.finish();
        GMTrace.o(2725022531584L, 20303);
      }
    }, null);
    GMTrace.o(2688112656384L, 20028);
  }
  
  protected final void MP()
  {
    GMTrace.i(2687844220928L, 20026);
    this.htD = ((ListView)findViewById(R.h.bNF));
    this.vPN = ((TextView)findViewById(R.h.bwA));
    this.vPN.setText(R.l.dsy);
    final Object localObject1 = (TextView)findViewById(R.h.bwF);
    ((TextView)localObject1).setText(R.l.dsw);
    final Object localObject2 = new com.tencent.mm.ui.tools.p(true, true);
    ((com.tencent.mm.ui.tools.p)localObject2).xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(2732672942080L, 20360);
        GMTrace.o(2732672942080L, 20360);
      }
      
      public final void QB()
      {
        GMTrace.i(16823118462976L, 125342);
        GMTrace.o(16823118462976L, 125342);
      }
      
      public final void Qy()
      {
        GMTrace.i(2732404506624L, 20358);
        GMTrace.o(2732404506624L, 20358);
      }
      
      public final void Qz()
      {
        GMTrace.i(2732538724352L, 20359);
        GMTrace.o(2732538724352L, 20359);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(2732136071168L, 20356);
        GMTrace.o(2732136071168L, 20356);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(2732270288896L, 20357);
        FacebookFriendUI.a(FacebookFriendUI.this, bg.nk(paramAnonymousString));
        paramAnonymousString = FacebookFriendUI.this;
        if (paramAnonymousString.vPM != null) {
          paramAnonymousString.vPM.Au(paramAnonymousString.htH);
        }
        GMTrace.o(2732270288896L, 20357);
      }
    };
    a((com.tencent.mm.ui.tools.p)localObject2);
    this.vPM = new d(this, new o.a()
    {
      public final void QC()
      {
        GMTrace.i(2774817308672L, 20674);
        if ((q.Af()) && (FacebookFriendUI.a(FacebookFriendUI.this)))
        {
          if (FacebookFriendUI.b(FacebookFriendUI.this).getCount() != 0) {
            break label64;
          }
          localObject1.setVisibility(0);
        }
        for (;;)
        {
          FacebookFriendUI.c(FacebookFriendUI.this);
          GMTrace.o(2774817308672L, 20674);
          return;
          label64:
          localObject1.setVisibility(8);
        }
      }
      
      public final void QD()
      {
        GMTrace.i(2774951526400L, 20675);
        GMTrace.o(2774951526400L, 20675);
      }
    });
    this.vPM.vPI = new d.a()
    {
      public final void Bs(int paramAnonymousInt)
      {
        GMTrace.i(2674422448128L, 19926);
        if (paramAnonymousInt > 0)
        {
          FacebookFriendUI.d(FacebookFriendUI.this).setVisibility(8);
          GMTrace.o(2674422448128L, 19926);
          return;
        }
        FacebookFriendUI.d(FacebookFriendUI.this).setVisibility(0);
        GMTrace.o(2674422448128L, 19926);
      }
    };
    this.htD.setAdapter(this.vPM);
    this.htF = findViewById(R.h.bNG);
    this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2764079890432L, 20594);
        paramAnonymousAdapterView = (com.tencent.mm.modelfriend.h)FacebookFriendUI.b(FacebookFriendUI.this).getItem(paramAnonymousInt - FacebookFriendUI.e(FacebookFriendUI.this).getHeaderViewsCount());
        if ((paramAnonymousAdapterView.status == 100) || (paramAnonymousAdapterView.status == 101))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.getUsername());
          paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.GX());
          paramAnonymousView.putExtra("Contact_KFacebookId", paramAnonymousAdapterView.fjc);
          paramAnonymousView.putExtra("Contact_KFacebookName", paramAnonymousAdapterView.Hg());
          paramAnonymousView.putExtra("Contact_Scene", 31);
          com.tencent.mm.plugin.c.a.hnH.d(paramAnonymousView, FacebookFriendUI.this);
        }
        if (paramAnonymousAdapterView.status == 102)
        {
          GMTrace.o(2764079890432L, 20594);
          return;
        }
        GMTrace.o(2764079890432L, 20594);
      }
    });
    w.d("MicroMsg.FacebookFriendUI", "isBindForFacebookApp:" + q.Af());
    if (q.Af())
    {
      this.htD.setVisibility(0);
      this.htF.setVisibility(8);
      at.AR();
      long l = bg.c((Long)com.tencent.mm.y.c.xh().get(65831, null));
      at.AR();
      localObject1 = bg.nl((String)com.tencent.mm.y.c.xh().get(65830, null));
      if ((bg.aH(l) > 86400000L) && (((String)localObject1).length() > 0))
      {
        localObject2 = new com.tencent.mm.ui.g.a.c("290293790992170");
        ((com.tencent.mm.ui.g.a.c)localObject2).WG((String)localObject1);
        new h((com.tencent.mm.ui.g.a.c)localObject2, new com.tencent.mm.z.a()
        {
          public final void m(Bundle paramAnonymousBundle)
          {
            GMTrace.i(2771864518656L, 20652);
            super.m(paramAnonymousBundle);
            GMTrace.o(2771864518656L, 20652);
          }
          
          public final void onError(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(2771998736384L, 20653);
            super.onError(paramAnonymousInt, paramAnonymousString);
            if (paramAnonymousInt == 3) {
              FacebookFriendUI.f(FacebookFriendUI.this);
            }
            GMTrace.o(2771998736384L, 20653);
          }
        }).bYB();
      }
      localObject1 = new v();
      ((v)localObject1).HO();
      localObject2 = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(2763811454976L, 20592);
          at.AR();
          com.tencent.mm.y.c.xh().set(65829, Integer.valueOf(1));
          at.wS().a(localObject1, 0);
          GMTrace.o(2763811454976L, 20592);
          return false;
        }
      }, false);
      at.AR();
      if (bg.e((Integer)com.tencent.mm.y.c.xh().get(65829, null)) > 0)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(65829, Integer.valueOf(1));
        at.wS().a((k)localObject1, 0);
        ActionBarActivity localActionBarActivity = this.vKB.vKW;
        getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.dOQ), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2755624173568L, 20531);
            localObject2.stopTimer();
            at.wS().c(localObject1);
            GMTrace.o(2755624173568L, 20531);
          }
        });
        a(0, getString(R.l.dvu), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2686099390464L, 20013);
            FacebookFriendUI.this.startActivity(new Intent(FacebookFriendUI.this, InviteFacebookFriendsUI.class));
            GMTrace.o(2686099390464L, 20013);
            return true;
          }
        });
      }
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2780722888704L, 20718);
          FacebookFriendUI.this.aLo();
          FacebookFriendUI.this.finish();
          GMTrace.o(2780722888704L, 20718);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2653350264832L, 19769);
          BackwardSupportUtil.c.a(FacebookFriendUI.e(FacebookFriendUI.this));
          GMTrace.o(2653350264832L, 19769);
        }
      };
      GMTrace.o(2687844220928L, 20026);
      return;
      ((aj)localObject2).z(5000L, 5000L);
      break;
      this.htD.setVisibility(8);
      this.htF.setVisibility(0);
      ((TextView)findViewById(R.h.bNH)).setText(R.l.dvn);
      this.htF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2665429860352L, 19859);
          FacebookFriendUI.this.startActivity(new Intent(FacebookFriendUI.this, FacebookAuthUI.class));
          GMTrace.o(2665429860352L, 19859);
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2687978438656L, 20027);
    w.i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 32)
    {
      GMTrace.o(2687978438656L, 20027);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = "error";
      }
      aw(getString(R.l.cUG), paramk);
      GMTrace.o(2687978438656L, 20027);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.vPM.a(null, null);
      GMTrace.o(2687978438656L, 20027);
      return;
    }
    Toast.makeText(this, R.l.dIO, 0).show();
    GMTrace.o(2687978438656L, 20027);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2687710003200L, 20025);
    int i = R.i.cwW;
    GMTrace.o(2687710003200L, 20025);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(2688246874112L, 20029);
    this.vPM.notifyDataSetChanged();
    GMTrace.o(2688246874112L, 20029);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2687173132288L, 20021);
    super.onCreate(paramBundle);
    oM(R.l.dvt);
    at.wS().a(32, this);
    MP();
    GMTrace.o(2687173132288L, 20021);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2687575785472L, 20024);
    at.wS().b(32, this);
    this.vPM.aJe();
    super.onDestroy();
    GMTrace.o(2687575785472L, 20024);
  }
  
  public void onPause()
  {
    GMTrace.i(2687441567744L, 20023);
    super.onPause();
    com.tencent.mm.ac.n.Dh().e(this);
    GMTrace.o(2687441567744L, 20023);
  }
  
  protected void onResume()
  {
    GMTrace.i(2687307350016L, 20022);
    super.onResume();
    com.tencent.mm.ac.n.Dh().d(this);
    this.vPM.notifyDataSetChanged();
    GMTrace.o(2687307350016L, 20022);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\FacebookFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
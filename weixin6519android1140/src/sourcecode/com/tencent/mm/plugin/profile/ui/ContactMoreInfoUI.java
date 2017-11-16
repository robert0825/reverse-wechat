package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactMoreInfoUI
  extends MMActivity
  implements j
{
  private String fKP;
  private com.tencent.mm.sdk.platformtools.ae handler;
  com.tencent.mm.storage.q jNF;
  private String jOR;
  boolean jPj;
  private x kse;
  private String mfZ;
  private ProfileNormalItemView nLY;
  private ProfileNormalItemView nLZ;
  private ProfileNormalItemView nMa;
  private ProfileNormalItemView nMb;
  private ProfileNormalItemView nMc;
  private ProfileNormalItemView nMd;
  private ProfileNormalItemView nMe;
  private String nMf;
  private String nMg;
  private String nMh;
  private long nMi;
  private String nMj;
  String nMk;
  
  public ContactMoreInfoUI()
  {
    GMTrace.i(6746990968832L, 50269);
    this.nMk = null;
    this.jPj = false;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    GMTrace.o(6746990968832L, 50269);
  }
  
  private boolean G(x paramx)
  {
    GMTrace.i(6747527839744L, 50273);
    if (com.tencent.mm.y.q.zE().equals(paramx.field_username))
    {
      at.AR();
      paramx = (String)c.xh().get(w.a.vsB, null);
      if (bg.nm(paramx)) {
        break label169;
      }
    }
    for (;;)
    {
      try
      {
        paramx = new JSONObject(paramx);
        this.nMk = paramx.optString("ShopUrl");
        paramx = paramx.optString("ShopName");
        if (bg.nm(this.nMk)) {
          break label174;
        }
        this.nMc.setVisibility(0);
        this.nMc.nOP = paramx;
        this.nMc.sM(getResources().getColor(R.e.aOH));
        paramx = this.nMc;
        paramx.nOQ = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6771418595328L, 50451);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", ContactMoreInfoUI.this.nMk);
            paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
            d.b(ContactMoreInfoUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            GMTrace.o(6771418595328L, 50451);
          }
        };
        paramx.aXX();
        GMTrace.o(6747527839744L, 50273);
        return true;
      }
      catch (JSONException paramx)
      {
        w.printErrStackTrace("MicroMsg.ContactMoreInfoUI", paramx, "", new Object[0]);
      }
      paramx = paramx.fjy;
      break;
      label169:
      paramx = null;
    }
    label174:
    this.nMc.setVisibility(8);
    GMTrace.o(6747527839744L, 50273);
    return false;
  }
  
  private void aXC()
  {
    GMTrace.i(6747662057472L, 50274);
    this.jPj = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.jOR = getIntent().getStringExtra("Contact_ChatRoomId");
    this.fKP = getIntent().getStringExtra("Contact_User");
    at.AR();
    this.kse = c.yK().TE(this.fKP);
    this.nMf = getIntent().getStringExtra("KLinkedInAddFriendNickName");
    this.nMg = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
    this.mfZ = getIntent().getStringExtra("verify_gmail");
    this.nMh = getIntent().getStringExtra("profileName");
    GMTrace.o(6747662057472L, 50274);
  }
  
  protected final void MP()
  {
    int j = 0;
    GMTrace.i(6747393622016L, 50272);
    super.MP();
    this.nLY = ((ProfileNormalItemView)findViewById(R.h.bKf));
    this.nLZ = ((ProfileNormalItemView)findViewById(R.h.bFu));
    this.nMa = ((ProfileNormalItemView)findViewById(R.h.bUH));
    this.nMd = ((ProfileNormalItemView)findViewById(R.h.cfb));
    this.nMd.sK(R.l.dkO);
    this.nMd.nJe.setSingleLine(false);
    this.nMe = ((ProfileNormalItemView)findViewById(R.h.bCc));
    this.nMe.sK(R.l.dlr);
    this.nMc = ((ProfileNormalItemView)findViewById(R.h.coo));
    this.nMb = ((ProfileNormalItemView)findViewById(R.h.bpO));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6741756477440L, 50230);
        ContactMoreInfoUI.this.finish();
        GMTrace.o(6741756477440L, 50230);
        return true;
      }
    });
    aXC();
    at.AR();
    this.jNF = c.yT().gC(this.jOR);
    Object localObject1 = com.tencent.mm.k.g.ut().getValue("LinkedinPluginClose");
    int i;
    boolean bool1;
    label307:
    boolean bool3;
    Object localObject2;
    boolean bool2;
    label548:
    boolean bool4;
    if ((bg.nm((String)localObject1)) || (Integer.valueOf((String)localObject1).intValue() == 0))
    {
      i = 1;
      if ((i == 0) || (bg.nm(this.kse.fjv))) {
        break label932;
      }
      this.nLY.setVisibility(0);
      if (bg.nm(this.nMf)) {
        this.nMf = this.kse.fjw;
      }
      localObject1 = this.nLY;
      ((ProfileNormalItemView)localObject1).nOP = this.nMf;
      ((ProfileNormalItemView)localObject1).nOQ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6792088125440L, 50605);
          if (bg.nm(ContactMoreInfoUI.a(ContactMoreInfoUI.this))) {
            ContactMoreInfoUI.a(ContactMoreInfoUI.this, ContactMoreInfoUI.b(ContactMoreInfoUI.this).fjx);
          }
          if (!bg.nm(ContactMoreInfoUI.a(ContactMoreInfoUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", ContactMoreInfoUI.a(ContactMoreInfoUI.this));
            paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
            d.b(ContactMoreInfoUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          }
          GMTrace.o(6792088125440L, 50605);
        }
      };
      bool1 = ((ProfileNormalItemView)localObject1).sM(getResources().getColor(R.e.aOH)).aXX();
      this.nLZ.setVisibility(0);
      localObject1 = this.nLZ;
      ((ProfileNormalItemView)localObject1).nOP = this.mfZ;
      bool3 = ((ProfileNormalItemView)localObject1).aXX();
      at.AR();
      i = bg.e((Integer)c.xh().get(9, null));
      this.nMi = getIntent().getLongExtra("Contact_Uin", 0L);
      this.nMj = getIntent().getStringExtra("Contact_QQNick");
      if ((this.nMi == 0L) || (i == 0)) {
        break label946;
      }
      if ((this.nMj == null) || (this.nMj.length() == 0))
      {
        long l = this.nMi;
        localObject2 = com.tencent.mm.modelfriend.af.Ik().am(l);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = null;
        }
        if (localObject1 != null) {
          this.nMj = ((ad)localObject1).getDisplayName();
        }
      }
      localObject1 = bg.nl(this.nMj);
      localObject1 = (String)localObject1 + " " + new o(this.nMi).longValue();
      this.nMa.setVisibility(0);
      localObject2 = this.nMa;
      ((ProfileNormalItemView)localObject2).nOP = ((CharSequence)localObject1);
      ((ProfileNormalItemView)localObject2).nOQ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6800006971392L, 50664);
          GMTrace.o(6800006971392L, 50664);
        }
      };
      bool2 = ((ProfileNormalItemView)localObject2).aXX();
      localObject1 = this.nMd;
      ((ProfileNormalItemView)localObject1).nOP = com.tencent.mm.pluginsdk.ui.d.h.a(this, this.kse.signature);
      bool4 = ((ProfileNormalItemView)localObject1).aXX();
      switch (this.kse.getSource())
      {
      default: 
        this.nMe.nOP = null;
      }
    }
    for (;;)
    {
      boolean bool5 = this.nMe.aXX();
      boolean bool6 = G(this.kse);
      i = j;
      if (!this.kse.field_username.equals(com.tencent.mm.y.q.zE()))
      {
        localObject1 = this.kse;
        if (!((com.tencent.mm.g.b.af)localObject1).field_username.equals(com.tencent.mm.y.q.zE())) {
          break label1482;
        }
        this.nMb.setVisibility(8);
        i = j;
      }
      if ((!bool4) && (!bool5) && (!bool6) && (!bool1) && (!bool3) && (!bool2) && (i == 0)) {
        finish();
      }
      GMTrace.o(6747393622016L, 50272);
      return;
      i = 0;
      break;
      label932:
      this.nLY.setVisibility(8);
      bool1 = false;
      break label307;
      label946:
      this.nMa.setVisibility(8);
      bool2 = false;
      break label548;
      this.nMe.sL(R.l.dwi);
      continue;
      if (this.kse.vm() > 1000000)
      {
        this.nMe.sL(R.l.dlk);
      }
      else
      {
        this.nMe.sL(R.l.dlj);
        continue;
        if (this.kse.vm() > 1000000)
        {
          this.nMe.sL(R.l.dlm);
        }
        else
        {
          this.nMe.sL(R.l.dll);
          continue;
          if (this.kse.vm() > 1000000)
          {
            this.nMe.sL(R.l.dkX);
          }
          else
          {
            this.nMe.sL(R.l.dkV);
            continue;
            if (this.kse.vm() > 1000000)
            {
              this.nMe.sL(R.l.dlc);
            }
            else
            {
              this.nMe.sL(R.l.dlb);
              continue;
              if (this.kse.vm() > 1000000)
              {
                this.nMe.sL(R.l.dlf);
              }
              else
              {
                this.nMe.sL(R.l.dle);
                continue;
                this.nMe.sL(R.l.dlg);
                continue;
                if (this.kse.vm() > 1000000)
                {
                  this.nMe.sL(R.l.dkZ);
                }
                else
                {
                  this.nMe.sL(R.l.dkY);
                  continue;
                  if (this.kse.vm() > 1000000)
                  {
                    this.nMe.sL(R.l.dlo);
                  }
                  else
                  {
                    this.nMe.sL(R.l.dln);
                    continue;
                    this.nMe.sL(R.l.dkS);
                    continue;
                    this.nMe.sL(R.l.dAZ);
                    continue;
                    this.nMe.sL(R.l.dld);
                    continue;
                    if (this.kse.vm() > 1000000)
                    {
                      this.nMe.sL(R.l.dlq);
                    }
                    else
                    {
                      this.nMe.sL(R.l.dlp);
                      continue;
                      if (this.kse.vm() > 1000000)
                      {
                        this.nMe.sL(R.l.dlq);
                      }
                      else
                      {
                        this.nMe.sL(R.l.dlp);
                        continue;
                        if (this.kse.vm() > 1000000)
                        {
                          this.nMe.sL(R.l.dkU);
                        }
                        else
                        {
                          this.nMe.sL(R.l.dkT);
                          continue;
                          if (this.kse.vm() > 1000000) {
                            this.nMe.sL(R.l.dli);
                          } else {
                            this.nMe.sL(R.l.dlh);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label1482:
    if (((com.tencent.mm.g.b.af)localObject1).fja == 1) {
      this.nMb.sK(R.l.djc);
    }
    for (;;)
    {
      this.nMb.aXX();
      localObject2 = new f();
      ((f)localObject2).eQb = ((com.tencent.mm.g.b.af)localObject1).field_username;
      ((f)localObject2).lwY = this;
      ((f)localObject2).handler = this.handler;
      ((f)localObject2).lwS = 5;
      ((l)com.tencent.mm.kernel.h.j(l.class)).search(2, (f)localObject2);
      i = 1;
      break;
      if (((com.tencent.mm.g.b.af)localObject1).fja == 2) {
        this.nMb.sK(R.l.djb);
      } else {
        this.nMb.sK(R.l.dje);
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.a.g paramg)
  {
    GMTrace.i(18474264952832L, 137644);
    if (paramg.aGY == 0)
    {
      final int i = ((Integer)((i)paramg.lxb.get(0)).userData).intValue();
      this.nMb.nOP = getString(R.l.djd, new Object[] { Integer.valueOf(i) });
      this.nMb.nOQ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18474399170560L, 137645);
          com.tencent.mm.plugin.fts.a.e.nY(i);
          if (i > 0)
          {
            paramAnonymousView = new Intent(ContactMoreInfoUI.this, CommonChatroomInfoUI.class);
            paramAnonymousView.putExtra("Select_Talker_Name", ContactMoreInfoUI.b(ContactMoreInfoUI.this).field_username);
            ContactMoreInfoUI.this.startActivity(paramAnonymousView);
          }
          GMTrace.o(18474399170560L, 137645);
        }
      };
    }
    for (;;)
    {
      this.nMb.aXX();
      GMTrace.o(18474264952832L, 137644);
      return;
      this.nMb.nOP = getString(R.l.djd, new Object[] { Integer.valueOf(0) });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6747125186560L, 50270);
    int i = R.i.ctK;
    GMTrace.o(6747125186560L, 50270);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6747259404288L, 50271);
    super.onCreate(paramBundle);
    aXC();
    MP();
    GMTrace.o(6747259404288L, 50271);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactMoreInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
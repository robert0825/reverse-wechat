package com.tencent.mm.plugin.accountsync.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.av.i.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.r;
import com.tencent.mm.modelfriend.v;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.g.a.c.a;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public class InviteFacebookFriendsUI
  extends MMActivity
  implements e
{
  private ListView htD;
  a htE;
  private View htF;
  private ProgressDialog htG;
  String htH;
  private final int htI;
  
  public InviteFacebookFriendsUI()
  {
    GMTrace.i(7838583750656L, 58402);
    this.htG = null;
    this.htI = 5;
    GMTrace.o(7838583750656L, 58402);
  }
  
  private void aw(String paramString1, String paramString2)
  {
    GMTrace.i(7839120621568L, 58406);
    com.tencent.mm.ui.base.h.a(this, paramString2, paramString1, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7845026201600L, 58450);
        paramAnonymousDialogInterface = new Intent(InviteFacebookFriendsUI.this.vKB.vKW, FacebookAuthUI.class);
        paramAnonymousDialogInterface.putExtra("is_force_unbind", true);
        InviteFacebookFriendsUI.this.vKB.vKW.startActivity(paramAnonymousDialogInterface);
        InviteFacebookFriendsUI.this.finish();
        GMTrace.o(7845026201600L, 58450);
      }
    }, null);
    GMTrace.o(7839120621568L, 58406);
  }
  
  protected final void MP()
  {
    GMTrace.i(7838986403840L, 58405);
    this.htD = ((ListView)findViewById(R.h.bNF));
    final Object localObject1 = (TextView)findViewById(R.h.bwF);
    ((TextView)localObject1).setText(R.l.dsw);
    final Object localObject2 = new com.tencent.mm.ui.tools.p(true, true);
    ((com.tencent.mm.ui.tools.p)localObject2).xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(7842744500224L, 58433);
        GMTrace.o(7842744500224L, 58433);
      }
      
      public final void QB()
      {
        GMTrace.i(16933982306304L, 126168);
        GMTrace.o(16933982306304L, 126168);
      }
      
      public final void Qy()
      {
        GMTrace.i(7842476064768L, 58431);
        GMTrace.o(7842476064768L, 58431);
      }
      
      public final void Qz()
      {
        GMTrace.i(7842610282496L, 58432);
        GMTrace.o(7842610282496L, 58432);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(7842207629312L, 58429);
        GMTrace.o(7842207629312L, 58429);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(7842341847040L, 58430);
        InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this, bg.nk(paramAnonymousString));
        paramAnonymousString = InviteFacebookFriendsUI.this;
        if (paramAnonymousString.htE != null)
        {
          InviteFacebookFriendsUI.a locala = paramAnonymousString.htE;
          locala.htQ = bg.nk(paramAnonymousString.htH.trim());
          locala.aJe();
          locala.QF();
        }
        GMTrace.o(7842341847040L, 58430);
      }
    };
    a((com.tencent.mm.ui.tools.p)localObject2);
    this.htE = new a(this, new o.a()
    {
      public final void QC()
      {
        GMTrace.i(7847844773888L, 58471);
        if (com.tencent.mm.y.q.Af())
        {
          if (InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).getCount() == 0)
          {
            localObject1.setVisibility(0);
            GMTrace.o(7847844773888L, 58471);
            return;
          }
          localObject1.setVisibility(8);
        }
        GMTrace.o(7847844773888L, 58471);
      }
      
      public final void QD()
      {
        GMTrace.i(7847978991616L, 58472);
        GMTrace.o(7847978991616L, 58472);
      }
    });
    this.htD.setAdapter(this.htE);
    this.htF = findViewById(R.h.bNG);
    this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7845428854784L, 58453);
        if (InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).QE().length >= 50)
        {
          com.tencent.mm.ui.base.h.h(InviteFacebookFriendsUI.this, R.l.dsC, R.l.cUG);
          GMTrace.o(7845428854784L, 58453);
          return;
        }
        InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).hK(paramAnonymousInt - InviteFacebookFriendsUI.b(InviteFacebookFriendsUI.this).getHeaderViewsCount());
        if (InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).QE().length > 0)
        {
          InviteFacebookFriendsUI.this.lg(true);
          GMTrace.o(7845428854784L, 58453);
          return;
        }
        InviteFacebookFriendsUI.this.lg(false);
        GMTrace.o(7845428854784L, 58453);
      }
    });
    w.d("MicroMsg.InviteFacebookFriendsUI", "isBindForFacebookApp:" + com.tencent.mm.y.q.Af());
    if (com.tencent.mm.y.q.Af())
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
        new com.tencent.mm.ui.account.h((com.tencent.mm.ui.g.a.c)localObject2, new com.tencent.mm.z.a()
        {
          public final void m(Bundle paramAnonymousBundle)
          {
            GMTrace.i(7841804976128L, 58426);
            super.m(paramAnonymousBundle);
            GMTrace.o(7841804976128L, 58426);
          }
          
          public final void onError(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(7841939193856L, 58427);
            super.onError(paramAnonymousInt, paramAnonymousString);
            if (paramAnonymousInt == 3) {
              InviteFacebookFriendsUI.c(InviteFacebookFriendsUI.this);
            }
            GMTrace.o(7841939193856L, 58427);
          }
        }).bYB();
      }
      localObject1 = new v();
      ((v)localObject1).HO();
      localObject2 = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(7841536540672L, 58424);
          at.AR();
          com.tencent.mm.y.c.xh().set(65829, Integer.valueOf(1));
          at.wS().a(localObject1, 0);
          GMTrace.o(7841536540672L, 58424);
          return false;
        }
      }, false);
      at.AR();
      if (bg.e((Integer)com.tencent.mm.y.c.xh().get(65829, null)) <= 0) {
        break label453;
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(65829, Integer.valueOf(1));
      at.wS().a((k)localObject1, 0);
    }
    for (;;)
    {
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.dOQ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7844489330688L, 58446);
          localObject2.stopTimer();
          at.wS().c(localObject1);
          GMTrace.o(7844489330688L, 58446);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7846905249792L, 58464);
          InviteFacebookFriendsUI.this.aLo();
          InviteFacebookFriendsUI.this.finish();
          GMTrace.o(7846905249792L, 58464);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7844757766144L, 58448);
          BackwardSupportUtil.c.a(InviteFacebookFriendsUI.b(InviteFacebookFriendsUI.this));
          GMTrace.o(7844757766144L, 58448);
        }
      };
      a(0, getString(R.l.dsA), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7849052733440L, 58480);
          com.tencent.mm.ui.g.a.c localc = new com.tencent.mm.ui.g.a.c("290293790992170");
          Bundle localBundle = new Bundle();
          localBundle.putString("message", InviteFacebookFriendsUI.this.getString(R.l.dsz));
          final long[] arrayOfLong = InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).QE();
          paramAnonymousMenuItem = Long.toString(arrayOfLong[0]);
          int i = 1;
          while (i < arrayOfLong.length)
          {
            paramAnonymousMenuItem = paramAnonymousMenuItem + ",";
            paramAnonymousMenuItem = paramAnonymousMenuItem + Long.toString(arrayOfLong[i]);
            i += 1;
          }
          localBundle.putString("to", paramAnonymousMenuItem);
          localc.a(InviteFacebookFriendsUI.this, "apprequests", localBundle, new c.a()
          {
            public final void a(com.tencent.mm.ui.g.a.b paramAnonymous2b)
            {
              GMTrace.i(7840999669760L, 58420);
              w.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
              GMTrace.o(7840999669760L, 58420);
            }
            
            public final void a(com.tencent.mm.ui.g.a.d paramAnonymous2d)
            {
              GMTrace.i(7840865452032L, 58419);
              w.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
              GMTrace.o(7840865452032L, 58419);
            }
            
            public final void m(Bundle paramAnonymous2Bundle)
            {
              GMTrace.i(7841133887488L, 58421);
              w.i("MicroMsg.InviteFacebookFriendsUI", "fbinvite oncomplete");
              paramAnonymous2Bundle = new ArrayList();
              paramAnonymous2Bundle.add(new i.a(33, Integer.toString(arrayOfLong.length)));
              at.AR();
              com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.i(paramAnonymous2Bundle));
              paramAnonymous2Bundle = arrayOfLong;
              int j = paramAnonymous2Bundle.length;
              int i = 0;
              while (i < j)
              {
                long l = paramAnonymous2Bundle[i];
                com.tencent.mm.modelfriend.q localq = new com.tencent.mm.modelfriend.q();
                localq.username = Long.toString(l);
                localq.gDr = 5;
                localq.gww = ((int)bg.Pu());
                af.Ij().a(localq);
                i += 1;
              }
              com.tencent.mm.ui.base.h.a(InviteFacebookFriendsUI.this, R.l.dsB, R.l.cUG, R.l.cUW, R.l.cTJ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(7843684024320L, 58440);
                  InviteFacebookFriendsUI.a(InviteFacebookFriendsUI.this).QF();
                  GMTrace.o(7843684024320L, 58440);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(7837107355648L, 58391);
                  InviteFacebookFriendsUI.this.finish();
                  GMTrace.o(7837107355648L, 58391);
                }
              });
              GMTrace.o(7841133887488L, 58421);
            }
            
            public final void onCancel()
            {
              GMTrace.i(7841268105216L, 58422);
              w.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite cancle");
              GMTrace.o(7841268105216L, 58422);
            }
          });
          GMTrace.o(7849052733440L, 58480);
          return true;
        }
      });
      lg(false);
      GMTrace.o(7838986403840L, 58405);
      return;
      label453:
      ((aj)localObject2).z(5000L, 5000L);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7839389057024L, 58408);
    w.i("MicroMsg.InviteFacebookFriendsUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 32)
    {
      GMTrace.o(7839389057024L, 58408);
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
      GMTrace.o(7839389057024L, 58408);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.htE.a(null, null);
      GMTrace.o(7839389057024L, 58408);
      return;
    }
    Toast.makeText(this, R.l.dIO, 0).show();
    GMTrace.o(7839389057024L, 58408);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7839254839296L, 58407);
    int i = R.i.cwW;
    GMTrace.o(7839254839296L, 58407);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7838717968384L, 58403);
    super.onCreate(paramBundle);
    oM(R.l.dsD);
    at.wS().a(32, this);
    MP();
    GMTrace.o(7838717968384L, 58403);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7838852186112L, 58404);
    at.wS().b(32, this);
    this.htE.aJe();
    super.onDestroy();
    GMTrace.o(7838852186112L, 58404);
  }
  
  public static final class a
    extends o<com.tencent.mm.modelfriend.h>
  {
    private int[] gCW;
    String htQ;
    private boolean[] htR;
    
    public a(Context paramContext, o.a parama)
    {
      super(new com.tencent.mm.modelfriend.h());
      GMTrace.i(7845563072512L, 58454);
      this.vKu = parama;
      GMTrace.o(7845563072512L, 58454);
    }
    
    public final long[] QE()
    {
      int m = 0;
      GMTrace.i(7845831507968L, 58456);
      Object localObject = this.htR;
      int n = localObject.length;
      int i = 0;
      int k;
      for (int j = 0; i < n; j = k)
      {
        k = j;
        if (localObject[i] != 0) {
          k = j + 1;
        }
        i += 1;
      }
      localObject = new long[j];
      j = 0;
      i = m;
      if (j < getCount())
      {
        if (this.htR[j] == 0) {
          break label118;
        }
        localObject[i] = ((com.tencent.mm.modelfriend.h)getItem(j)).fjc;
        i += 1;
      }
      label118:
      for (;;)
      {
        j += 1;
        break;
        GMTrace.o(7845831507968L, 58456);
        return (long[])localObject;
      }
    }
    
    public final void QF()
    {
      GMTrace.i(7846099943424L, 58458);
      com.tencent.mm.modelfriend.i locali = af.Ig();
      String str = this.htQ;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(" where facebookfriend.status = 102 ");
      if ((str != null) && (str.length() > 0))
      {
        localStringBuilder.append(" and ( ");
        localStringBuilder.append("facebookfriend.fbname like '%" + str + "%' or ");
        localStringBuilder.append("facebookfriend.nickname like '%" + str + "%' or ");
        localStringBuilder.append("facebookfriend.username like '%" + str + "%' ) ");
      }
      setCursor(locali.goN.a("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + localStringBuilder.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null, 0));
      this.gCW = new int[getCount()];
      this.htR = new boolean[getCount()];
      super.notifyDataSetChanged();
      GMTrace.o(7846099943424L, 58458);
    }
    
    protected final void QG()
    {
      GMTrace.i(7846234161152L, 58459);
      QF();
      GMTrace.o(7846234161152L, 58459);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7845697290240L, 58455);
      com.tencent.mm.modelfriend.h localh = (com.tencent.mm.modelfriend.h)getItem(paramInt);
      Bitmap localBitmap;
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cwk, null);
        paramViewGroup.hqg = ((ImageView)paramView.findViewById(R.h.brE));
        paramViewGroup.gDd = ((TextView)paramView.findViewById(R.h.bUO));
        paramViewGroup.htS = ((TextView)paramView.findViewById(R.h.bHI));
        paramViewGroup.htT = ((CheckBox)paramView.findViewById(R.h.bHT));
        paramView.setTag(paramViewGroup);
        paramViewGroup.gDd.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, localh.Hg(), paramViewGroup.gDd.getTextSize()));
        localBitmap = com.tencent.mm.ac.b.hM(localh.fjc);
        if (localBitmap != null) {
          break label233;
        }
        paramViewGroup.hqg.setImageDrawable(com.tencent.mm.br.a.b(this.context, R.k.aVS));
        label174:
        paramViewGroup.htT.setChecked(this.htR[paramInt]);
        if (!af.Ij().jT(Long.toString(localh.fjc))) {
          break label245;
        }
        paramViewGroup.htS.setVisibility(0);
      }
      for (;;)
      {
        GMTrace.o(7845697290240L, 58455);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label233:
        paramViewGroup.hqg.setImageBitmap(localBitmap);
        break label174;
        label245:
        paramViewGroup.htS.setVisibility(8);
      }
    }
    
    public final void hK(int paramInt)
    {
      GMTrace.i(7845965725696L, 58457);
      if ((paramInt < 0) || (paramInt >= this.htR.length))
      {
        GMTrace.o(7845965725696L, 58457);
        return;
      }
      boolean[] arrayOfBoolean = this.htR;
      if (this.htR[paramInt] == 0) {}
      for (int i = 1;; i = 0)
      {
        arrayOfBoolean[paramInt] = i;
        super.notifyDataSetChanged();
        GMTrace.o(7845965725696L, 58457);
        return;
      }
    }
    
    public static final class a
    {
      TextView gDd;
      ImageView hqg;
      TextView htS;
      CheckBox htT;
      
      public a()
      {
        GMTrace.i(7845160419328L, 58451);
        GMTrace.o(7845160419328L, 58451);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\accountsync\ui\InviteFacebookFriendsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
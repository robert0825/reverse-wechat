package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.bz.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.chatroom.d.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.dn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeeAccessVerifyInfoUI
  extends MMActivity
{
  private long gGK;
  private r hsU;
  private q jNF;
  private TextView jQA;
  private GridView jQB;
  private com.tencent.mm.y.c jQm;
  private b jQn;
  private String jQo;
  private String jQp;
  private String jQq;
  private String jQr;
  private String jQs;
  private String jQt;
  private String jQu;
  private String jQv;
  private TextView jQw;
  private TextView jQx;
  private ImageView jQy;
  private TextView jQz;
  
  public SeeAccessVerifyInfoUI()
  {
    GMTrace.i(9142777413632L, 68119);
    GMTrace.o(9142777413632L, 68119);
  }
  
  protected final void MP()
  {
    Object localObject1 = null;
    GMTrace.i(9143448502272L, 68124);
    this.jQw = ((TextView)findViewById(R.h.bHP));
    this.jQx = ((TextView)findViewById(R.h.bHO));
    this.jQz = ((TextView)findViewById(R.h.bZd));
    this.jQy = ((ImageView)findViewById(R.h.bZe));
    this.jQA = ((TextView)findViewById(R.h.bcy));
    this.jQB = ((GridView)findViewById(R.h.bgn));
    this.jQB.setAdapter(this.jQn);
    if (this.jQy != null) {
      this.jQy.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9114189037568L, 67906);
          SeeAccessVerifyInfoUI.b(SeeAccessVerifyInfoUI.this);
          x localx = com.tencent.mm.y.c.yK().TE(bg.nl(SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this)));
          String str = localx.field_nickname;
          paramAnonymousView = null;
          if (SeeAccessVerifyInfoUI.c(SeeAccessVerifyInfoUI.this) != null) {
            paramAnonymousView = SeeAccessVerifyInfoUI.c(SeeAccessVerifyInfoUI.this).fs(SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this));
          }
          Object localObject = paramAnonymousView;
          if (bg.nm(paramAnonymousView)) {
            localObject = localx.vk();
          }
          SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this, SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this), (String)localObject, str, false);
          GMTrace.o(9114189037568L, 67906);
        }
      });
    }
    this.jQB.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9103317401600L, 67825);
        GMTrace.o(9103317401600L, 67825);
        return true;
      }
    });
    this.jQB.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9108686110720L, 67865);
        int i = 0;
        if (SeeAccessVerifyInfoUI.d(SeeAccessVerifyInfoUI.this) != null) {
          i = (int)(SeeAccessVerifyInfoUI.d(SeeAccessVerifyInfoUI.this).getHeight() + SeeAccessVerifyInfoUI.this.getResources().getDimension(R.f.aPy) + SeeAccessVerifyInfoUI.this.getResources().getDimension(R.f.aQy));
        }
        int j = i;
        if (SeeAccessVerifyInfoUI.e(SeeAccessVerifyInfoUI.this).getCount() / 4 > 0) {
          j = i * (SeeAccessVerifyInfoUI.e(SeeAccessVerifyInfoUI.this).getCount() / 4 + 1);
        }
        SeeAccessVerifyInfoUI.f(SeeAccessVerifyInfoUI.this).setLayoutParams(new LinearLayout.LayoutParams(SeeAccessVerifyInfoUI.f(SeeAccessVerifyInfoUI.this).getWidth(), j));
        GMTrace.o(9108686110720L, 67865);
      }
    }, 100L);
    if (this.jQy != null) {
      a.b.a(this.jQy, bg.nl(this.jQs));
    }
    TextView localTextView1;
    Object localObject2;
    TextView localTextView2;
    if (this.jQz != null)
    {
      localTextView1 = this.jQz;
      localObject2 = bg.nl(this.jQs);
      localTextView2 = this.jQz;
      if (localTextView2 != null) {
        break label411;
      }
    }
    label411:
    x localx;
    for (;;)
    {
      localTextView1.setText((CharSequence)localObject1);
      if (this.jQw != null) {
        this.jQw.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, bg.nl(this.jQr)));
      }
      if ((this.jQx != null) && (!bg.nm(this.jQu))) {
        this.jQx.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this, "\"" + bg.nl(this.jQu) + "\""));
      }
      if (this.jQA != null) {
        this.jQA.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9098619781120L, 67790);
            paramAnonymousView = SeeAccessVerifyInfoUI.this;
            ActionBarActivity localActionBarActivity = SeeAccessVerifyInfoUI.this.vKB.vKW;
            SeeAccessVerifyInfoUI.this.getString(R.l.cUG);
            SeeAccessVerifyInfoUI.a(paramAnonymousView, com.tencent.mm.ui.base.h.a(localActionBarActivity, SeeAccessVerifyInfoUI.this.getString(R.l.cQf), false, null));
            new b(SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this), SeeAccessVerifyInfoUI.j(SeeAccessVerifyInfoUI.this), SeeAccessVerifyInfoUI.k(SeeAccessVerifyInfoUI.this), new LinkedList(bg.g(SeeAccessVerifyInfoUI.l(SeeAccessVerifyInfoUI.this).split(",")))).Dy().c(SeeAccessVerifyInfoUI.this).f(new com.tencent.mm.vending.c.a() {});
            GMTrace.o(9098619781120L, 67790);
          }
        });
      }
      if (this.jQA != null)
      {
        at.AR();
        if (com.tencent.mm.y.c.yM().cM(this.gGK).bTV())
        {
          this.jQA.setBackgroundResource(R.g.aUG);
          this.jQA.setTextColor(getResources().getColor(R.e.aNT));
          this.jQA.setText(getString(R.l.dCI));
          this.jQA.setEnabled(false);
        }
      }
      GMTrace.o(9143448502272L, 68124);
      return;
      localx = com.tencent.mm.y.c.yK().TE(bg.nl((String)localObject2));
      if (localx != null) {
        break;
      }
      w.w("MicroMsg.SeeAccessVerifyInfoUI", "ct == null");
    }
    if (!bg.nm(localx.field_conRemark)) {
      localObject1 = localx.field_conRemark;
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject2 = localx.field_conRemark;
      }
      localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = localx.vj();
      }
      localObject1 = com.tencent.mm.pluginsdk.ui.d.h.b(this, bg.nl((String)localObject1), localTextView2.getTextSize());
      break;
      if (this.jNF != null) {
        localObject1 = this.jNF.fs((String)localObject2);
      } else {
        localObject1 = null;
      }
    }
  }
  
  protected final c ch(View paramView)
  {
    GMTrace.i(9143582720000L, 68125);
    c localc = new c();
    localc.hqG = ((ImageView)paramView.findViewById(R.h.bZe));
    localc.jQH = ((TextView)paramView.findViewById(R.h.bZd));
    GMTrace.o(9143582720000L, 68125);
    return localc;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9143314284544L, 68123);
    int i = R.i.cFC;
    GMTrace.o(9143314284544L, 68123);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9142911631360L, 68120);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SeeAccessVerifyInfoUI", "[onCreate]");
    sq(getString(R.l.cQe));
    this.gGK = getIntent().getLongExtra("msgLocalId", 0L);
    this.jQr = getIntent().getStringExtra("invitertitle");
    this.jQs = getIntent().getStringExtra("inviterusername");
    this.jQt = getIntent().getStringExtra("chatroom");
    this.jQu = getIntent().getStringExtra("invitationreason");
    this.jQv = getIntent().getStringExtra("ticket");
    this.jQp = getIntent().getStringExtra("username");
    this.jQo = getIntent().getStringExtra("nickname");
    this.jQq = getIntent().getStringExtra("headimgurl");
    this.jQm = at.AR();
    this.jNF = com.tencent.mm.y.c.yT().gC(bg.nl(this.jQt));
    this.jQn = new b(this);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9158615105536L, 68237);
        SeeAccessVerifyInfoUI.this.finish();
        GMTrace.o(9158615105536L, 68237);
        return true;
      }
    });
    GMTrace.o(9142911631360L, 68120);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9143180066816L, 68122);
    super.onDestroy();
    GMTrace.o(9143180066816L, 68122);
  }
  
  protected void onResume()
  {
    GMTrace.i(9143045849088L, 68121);
    w.i("MicroMsg.SeeAccessVerifyInfoUI", "[onResume]");
    super.onResume();
    GMTrace.o(9143045849088L, 68121);
  }
  
  public final class a
  {
    String eCQ;
    String jQE;
    String username;
    
    a(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(9098351345664L, 67788);
      this.username = paramString1;
      this.eCQ = paramString2;
      this.jQE = paramString3;
      GMTrace.o(9098351345664L, 67788);
    }
  }
  
  public final class b
    extends BaseAdapter
  {
    private com.tencent.mm.ao.a.a.c jQF;
    List<SeeAccessVerifyInfoUI.a> jtR;
    Context mContext;
    
    public b(Context paramContext)
    {
      GMTrace.i(9139421970432L, 68094);
      this.jtR = new ArrayList();
      this.jQF = null;
      this.mContext = paramContext;
      anM();
      this$1 = new c.a();
      SeeAccessVerifyInfoUI.this.gKC = true;
      SeeAccessVerifyInfoUI.this.gKY = true;
      SeeAccessVerifyInfoUI.this.gKR = R.k.aVS;
      this.jQF = SeeAccessVerifyInfoUI.this.Jn();
      GMTrace.o(9139421970432L, 68094);
    }
    
    private void anM()
    {
      GMTrace.i(9139556188160L, 68095);
      String[] arrayOfString1 = null;
      String[] arrayOfString3;
      int i;
      label101:
      List localList;
      SeeAccessVerifyInfoUI localSeeAccessVerifyInfoUI;
      String str3;
      String str1;
      if (!bg.nm(SeeAccessVerifyInfoUI.l(SeeAccessVerifyInfoUI.this)))
      {
        String[] arrayOfString2 = SeeAccessVerifyInfoUI.l(SeeAccessVerifyInfoUI.this).split(",");
        if (bg.nm(SeeAccessVerifyInfoUI.m(SeeAccessVerifyInfoUI.this))) {
          break label216;
        }
        arrayOfString3 = SeeAccessVerifyInfoUI.m(SeeAccessVerifyInfoUI.this).split(",");
        if (bg.nm(SeeAccessVerifyInfoUI.n(SeeAccessVerifyInfoUI.this))) {
          break label232;
        }
        arrayOfString1 = SeeAccessVerifyInfoUI.n(SeeAccessVerifyInfoUI.this).split(",");
        this.jtR.clear();
        i = 0;
        if (i >= arrayOfString2.length) {
          break label258;
        }
        localList = this.jtR;
        localSeeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
        str3 = arrayOfString2[i];
        if ((arrayOfString3.length > i) && (!bg.nm(arrayOfString3[i]))) {
          break label242;
        }
        str1 = arrayOfString2[i];
        label148:
        if ((arrayOfString1 != null) && (arrayOfString1.length > i) && (!bg.nm(arrayOfString1[i]))) {
          break label250;
        }
      }
      label216:
      label232:
      label242:
      label250:
      for (String str2 = "";; str2 = arrayOfString1[i])
      {
        localList.add(new SeeAccessVerifyInfoUI.a(localSeeAccessVerifyInfoUI, str3, str1, str2));
        i += 1;
        break label101;
        w.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesUsernames null");
        GMTrace.o(9139556188160L, 68095);
        return;
        w.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesNicknames null");
        GMTrace.o(9139556188160L, 68095);
        return;
        w.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesHeadimgurls null");
        break;
        str1 = arrayOfString3[i];
        break label148;
      }
      label258:
      GMTrace.o(9139556188160L, 68095);
    }
    
    public final int getCount()
    {
      GMTrace.i(9139690405888L, 68096);
      int i = this.jtR.size();
      GMTrace.o(9139690405888L, 68096);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(9139824623616L, 68097);
      Object localObject = this.jtR.get(paramInt);
      GMTrace.o(9139824623616L, 68097);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9139958841344L, 68098);
      long l = paramInt;
      GMTrace.o(9139958841344L, 68098);
      return l;
    }
    
    public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9140093059072L, 68099);
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cET, null);
        paramViewGroup = SeeAccessVerifyInfoUI.this.ch(paramView);
      }
      for (;;)
      {
        paramViewGroup.hqG.setVisibility(0);
        paramViewGroup.jQH.setVisibility(0);
        n.Jd().a(((SeeAccessVerifyInfoUI.a)this.jtR.get(paramInt)).jQE, paramViewGroup.hqG, this.jQF);
        paramViewGroup.jQH.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, bg.nl(((SeeAccessVerifyInfoUI.a)this.jtR.get(paramInt)).eCQ), paramViewGroup.jQH.getTextSize()));
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9101438353408L, 67811);
            String str = ((SeeAccessVerifyInfoUI.a)SeeAccessVerifyInfoUI.b.this.jtR.get(paramInt)).eCQ;
            paramAnonymousView = null;
            if (SeeAccessVerifyInfoUI.c(SeeAccessVerifyInfoUI.this) != null) {
              paramAnonymousView = SeeAccessVerifyInfoUI.c(SeeAccessVerifyInfoUI.this).fs(((SeeAccessVerifyInfoUI.a)SeeAccessVerifyInfoUI.b.this.jtR.get(paramInt)).username);
            }
            if (bg.nm(paramAnonymousView))
            {
              SeeAccessVerifyInfoUI.b(SeeAccessVerifyInfoUI.this);
              paramAnonymousView = com.tencent.mm.y.c.yK().TE(bg.nl(((SeeAccessVerifyInfoUI.a)SeeAccessVerifyInfoUI.b.this.jtR.get(paramInt)).username)).vk();
            }
            for (;;)
            {
              SeeAccessVerifyInfoUI.a(SeeAccessVerifyInfoUI.this, ((SeeAccessVerifyInfoUI.a)SeeAccessVerifyInfoUI.b.this.jtR.get(paramInt)).username, paramAnonymousView, str, true);
              GMTrace.o(9101438353408L, 67811);
              return;
            }
          }
        });
        GMTrace.o(9140093059072L, 68099);
        return paramView;
        paramViewGroup = (SeeAccessVerifyInfoUI.c)paramView.getTag();
        if (paramViewGroup == null) {
          paramViewGroup = SeeAccessVerifyInfoUI.this.ch(paramView);
        }
      }
    }
  }
  
  final class c
  {
    public ImageView hqG;
    public TextView jQH;
    
    c()
    {
      GMTrace.i(9158749323264L, 68238);
      GMTrace.o(9158749323264L, 68238);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SeeAccessVerifyInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
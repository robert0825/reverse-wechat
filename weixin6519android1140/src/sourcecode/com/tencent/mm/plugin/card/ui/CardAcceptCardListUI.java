package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ab;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.p;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.g;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardAcceptCardListUI
  extends MMActivity
  implements e, MMActivity.a
{
  int eTL;
  private String gjw;
  private r ihl;
  private Button jCg;
  public int jCn;
  private String jCo;
  private String jCp;
  public ArrayList<String> jCq;
  public ArrayList<String> jCr;
  HashMap<String, Integer> jDD;
  private View jDJ;
  private View jDK;
  private View jDL;
  protected a jDM;
  private View jDN;
  private View jDO;
  private TextView jDP;
  private Button jDQ;
  LinkedList<jn> jDR;
  int jDS;
  String jDT;
  String jDU;
  private String jDV;
  LinkedList<jn> jDW;
  LinkedList<String> jDX;
  protected ListView jwt;
  protected RelativeLayout jwv;
  private boolean jxS;
  private String jzR;
  private int jzS;
  private String jzT;
  private int jzU;
  private String jzV;
  
  public CardAcceptCardListUI()
  {
    GMTrace.i(5015045406720L, 37365);
    this.jwt = null;
    this.jDM = null;
    this.jwv = null;
    this.ihl = null;
    this.jDR = new LinkedList();
    this.jzR = "";
    this.eTL = 8;
    this.jDS = 7;
    this.jDT = "";
    this.jDU = "";
    this.jDV = "";
    this.jxS = false;
    this.jCn = 0;
    this.jCo = "";
    this.jCp = "";
    this.jCq = new ArrayList();
    this.jCr = new ArrayList();
    this.jDW = new LinkedList();
    this.jDX = new LinkedList();
    this.jDD = new HashMap();
    this.gjw = "";
    GMTrace.o(5015045406720L, 37365);
  }
  
  private ArrayList<CardInfo> ab(List<CardInfo> paramList)
  {
    GMTrace.i(5016656019456L, 37377);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
      GMTrace.o(5016656019456L, 37377);
      return null;
    }
    this.jDW.clear();
    this.jDX.clear();
    this.jDD.clear();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramList.size())
    {
      CardInfo localCardInfo = (CardInfo)paramList.get(i);
      if (this.jDX.contains(localCardInfo.field_card_tp_id))
      {
        int j = ((Integer)this.jDD.get(localCardInfo.field_card_tp_id)).intValue();
        this.jDD.put(localCardInfo.field_card_tp_id, Integer.valueOf(j + 1));
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(localCardInfo);
        this.jDD.put(localCardInfo.field_card_tp_id, Integer.valueOf(1));
        this.jDX.add(localCardInfo.field_card_tp_id);
      }
    }
    GMTrace.o(5016656019456L, 37377);
    return localArrayList;
  }
  
  private String akP()
  {
    GMTrace.i(5016387584000L, 37375);
    String str;
    if ((!TextUtils.isEmpty(this.jCo)) && (!TextUtils.isEmpty(this.jCp)))
    {
      str = this.jCo + "," + l.uH(this.jCp);
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCo))
    {
      str = this.jCo;
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCp))
    {
      str = l.uH(this.jCp);
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    GMTrace.o(5016387584000L, 37375);
    return "";
  }
  
  private void ald()
  {
    GMTrace.i(5016521801728L, 37376);
    if (!TextUtils.isEmpty(this.jzV))
    {
      this.jDP.setText(this.jzV);
      GMTrace.o(5016521801728L, 37376);
      return;
    }
    this.jDP.setText(R.l.ddE);
    GMTrace.o(5016521801728L, 37376);
  }
  
  private void lO(int paramInt)
  {
    GMTrace.i(5016119148544L, 37373);
    w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("card_list", this.jzR);
    localIntent.putExtra("result_code", paramInt);
    setResult(0, localIntent);
    finish();
    GMTrace.o(5016119148544L, 37373);
  }
  
  protected final void MP()
  {
    GMTrace.i(5015313842176L, 37367);
    oM(R.l.dbR);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5010482003968L, 37331);
        w.v("MicroMsg.CardAcceptCardListUI", "setBackBtn cancel");
        CardAcceptCardListUI.a(CardAcceptCardListUI.this, 1);
        GMTrace.o(5010482003968L, 37331);
        return true;
      }
    });
    this.jDJ = findViewById(R.h.biT);
    this.jDK = findViewById(R.h.cib);
    this.jDL = findViewById(R.h.bKj);
    this.jDK.setVisibility(4);
    this.jwt = ((ListView)findViewById(16908298));
    this.jwv = ((RelativeLayout)findViewById(R.h.brV));
    this.jwt.setEmptyView(this.jwv);
    this.jDM = new a(this);
    this.jwt.setAdapter(this.jDM);
    this.jwt.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4989007167488L, 37171);
        GMTrace.o(4989007167488L, 37171);
      }
    });
    this.jDN = findViewById(R.h.biX);
    this.jCg = ((Button)findViewById(R.h.biO));
    this.jCg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5004979077120L, 37290);
        if (CardAcceptCardListUI.a(CardAcceptCardListUI.this))
        {
          CardAcceptCardListUI.a(CardAcceptCardListUI.this, CardAcceptCardListUI.b(CardAcceptCardListUI.this));
          GMTrace.o(5004979077120L, 37290);
          return;
        }
        paramAnonymousView = CardAcceptCardListUI.this;
        LinkedList localLinkedList = CardAcceptCardListUI.b(CardAcceptCardListUI.this);
        paramAnonymousView.du(true);
        paramAnonymousView = new p(localLinkedList, paramAnonymousView.eTL, paramAnonymousView.jDT, paramAnonymousView.jDU, paramAnonymousView.jDS);
        at.wS().a(paramAnonymousView, 0);
        GMTrace.o(5004979077120L, 37290);
      }
    });
    this.jCg.setEnabled(false);
    this.jDO = findViewById(R.h.blj);
    this.jDP = ((TextView)findViewById(R.h.blk));
    this.jDQ = ((Button)findViewById(R.h.bli));
    this.jDQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5028198744064L, 37463);
        CardAcceptCardListUI.c(CardAcceptCardListUI.this);
        GMTrace.o(5028198744064L, 37463);
      }
    });
    Object localObject2 = getIntent();
    if (localObject2 == null)
    {
      w.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
      lO(2);
      GMTrace.o(5015313842176L, 37367);
      return;
    }
    w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
    Object localObject3 = ((Intent)localObject2).getStringExtra("key_in_card_list");
    this.eTL = ((Intent)localObject2).getIntExtra("key_from_scene", 8);
    Object localObject1 = ((Intent)localObject2).getStringExtra("key_package_name");
    localObject2 = ((Intent)localObject2).getStringExtra("key_sign");
    this.jDS = getIntent().getIntExtra("key_stastic_scene", 7);
    this.jDT = getIntent().getStringExtra("src_username");
    this.jDU = getIntent().getStringExtra("js_url");
    this.jDV = getIntent().getStringExtra("key_consumed_card_id");
    this.gjw = getIntent().getStringExtra("key_template_id");
    localObject3 = com.tencent.mm.plugin.card.b.h.aI((String)localObject3, this.eTL);
    if ((localObject3 == null) || (((List)localObject3).size() == 0))
    {
      w.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
      lO(2);
      GMTrace.o(5015313842176L, 37367);
      return;
    }
    this.jDR.clear();
    this.jDR.addAll((Collection)localObject3);
    this.jDW.clear();
    this.jDX.clear();
    this.jDD.clear();
    localObject3 = this.jDR;
    du(true);
    localObject1 = new ab((LinkedList)localObject3, this.eTL, (String)localObject1, (String)localObject2, this.jDT, this.jDU, this.jDV, this.jDS);
    at.wS().a((k)localObject1, 0);
    GMTrace.o(5015313842176L, 37367);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5016253366272L, 37374);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5016253366272L, 37374);
      return;
      if (paramInt2 != -1)
      {
        GMTrace.o(5016253366272L, 37374);
        return;
      }
      this.jCn = paramIntent.getIntExtra("Ktag_range_index", 0);
      w.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.jCn) });
      if (this.jCn >= 2)
      {
        this.jCo = paramIntent.getStringExtra("Klabel_name_list");
        this.jCp = paramIntent.getStringExtra("Kother_user_name_list");
        w.d("MicroMsg.CardAcceptCardListUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.jCn), this.jCo });
        if ((TextUtils.isEmpty(this.jCo)) && (TextUtils.isEmpty(this.jCp)))
        {
          w.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
          ald();
          GMTrace.o(5016253366272L, 37374);
          return;
        }
        paramIntent = Arrays.asList(this.jCo.split(","));
        this.jCr = l.ae(paramIntent);
        this.jCq = l.ad(paramIntent);
        if ((this.jCp != null) && (this.jCp.length() > 0))
        {
          paramIntent = Arrays.asList(this.jCp.split(","));
          this.jCq.addAll(paramIntent);
        }
        if (this.jCr != null) {
          w.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.jCr.size());
        }
        if (this.jCq != null)
        {
          w.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.jCq.size());
          paramIntent = this.jCq.iterator();
          while (paramIntent.hasNext()) {
            w.d("MicroMsg.CardAcceptCardListUI", "username : %s", new Object[] { (String)paramIntent.next() });
          }
        }
        if (!TextUtils.isEmpty(this.jCo))
        {
          if (this.jCn == 2)
          {
            this.jDP.setText(getString(R.l.ddG, new Object[] { akP() }));
            GMTrace.o(5016253366272L, 37374);
            return;
          }
          if (this.jCn == 3)
          {
            this.jDP.setText(getString(R.l.ddF, new Object[] { akP() }));
            GMTrace.o(5016253366272L, 37374);
          }
        }
        else
        {
          ald();
        }
        GMTrace.o(5016253366272L, 37374);
        return;
      }
      ald();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5015850713088L, 37371);
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof ab))
      {
        du(false);
        paramString = (ab)paramk;
        paramk = paramString.jzG;
        this.jzS = paramString.jzS;
        this.jzT = paramString.jzT;
        this.jzU = paramString.jzU;
        this.jzV = paramString.jzV;
        w.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.jzS + "  accept_button_wording: " + this.jzT);
        w.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.jzU + "  private_wording: " + this.jzV);
        paramString = f.uw(paramk);
        paramk = ab(paramString);
        if ((paramString != null) && (paramString.size() > 0))
        {
          w.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + paramString.size());
          if ((paramk != null) && (paramk.size() > 0))
          {
            localObject1 = this.jDM;
            localObject2 = this.jDD;
            if (paramk != null)
            {
              ((a)localObject1).jCF.clear();
              ((a)localObject1).jCF.addAll(paramk);
              ((a)localObject1).jDD.putAll((Map)localObject2);
            }
          }
          this.jDM.notifyDataSetChanged();
          if (((CardInfo)paramString.get(0)).ajb()) {
            this.jxS = true;
          }
          this.jDK.setVisibility(0);
          if (this.jDM.getCount() <= 0) {
            break label873;
          }
          paramString = this.jDM.lN(0);
          m.a(this, paramString);
          this.jDJ.setBackgroundColor(l.uD(paramString.ajv().gjg));
          this.jDN.setVisibility(0);
          paramk = new StateListDrawable();
          paramInt1 = getResources().getDimensionPixelOffset(R.f.aRs);
          if (this.jzS != 1) {
            break label705;
          }
          this.jCg.setEnabled(true);
          localObject1 = l.bN(l.uD(paramString.ajv().gjg), paramInt1);
          Object localObject2 = l.bN(l.aL(paramString.ajv().gjg, 175), paramInt1);
          paramk.addState(new int[] { 16842919 }, (Drawable)localObject2);
          paramk.addState(new int[0], (Drawable)localObject1);
          label450:
          this.jCg.setBackgroundDrawable(paramk);
          if (!TextUtils.isEmpty(this.jzT)) {
            this.jCg.setText(this.jzT);
          }
          if (this.jzU != 1) {
            break label765;
          }
          paramInt1 = getResources().getDimensionPixelOffset(R.f.aQE);
          paramk = l.d(this, getResources().getColor(R.e.white), paramInt1);
          localObject1 = l.bN(getResources().getColor(R.e.white), paramInt1);
          localObject2 = new StateListDrawable();
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, (Drawable)localObject1);
          ((StateListDrawable)localObject2).addState(new int[0], paramk);
          this.jDQ.setBackgroundDrawable((Drawable)localObject2);
          paramInt1 = l.uD(paramString.ajv().gjg);
          paramInt2 = getResources().getColor(R.e.white);
          paramString = new int[0];
          paramString = new ColorStateList(new int[][] { { 16842919, 16842910 }, paramString }, new int[] { paramInt1, paramInt2 });
          this.jDQ.setTextColor(paramString);
          this.jDO.setVisibility(0);
          if (TextUtils.isEmpty(this.jzV)) {
            break label745;
          }
          this.jDP.setText(this.jzV);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(5015850713088L, 37371);
      return;
      w.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
      break;
      label705:
      this.jCg.setEnabled(false);
      localObject1 = l.bN(l.aL(paramString.ajv().gjg, 175), paramInt1);
      paramk.addState(new int[0], (Drawable)localObject1);
      break label450;
      label745:
      this.jDP.setText(R.l.ddE);
      GMTrace.o(5015850713088L, 37371);
      return;
      label765:
      this.jDO.setVisibility(8);
      paramString = (RelativeLayout.LayoutParams)this.jDK.getLayoutParams();
      paramString.topMargin = getResources().getDimensionPixelSize(R.f.aQN);
      paramString.bottomMargin = getResources().getDimensionPixelSize(R.f.aQs);
      this.jDK.setLayoutParams(paramString);
      this.jDK.invalidate();
      paramString = (RelativeLayout.LayoutParams)this.jDN.getLayoutParams();
      paramString.addRule(8, R.h.bKj);
      this.jDN.setLayoutParams(paramString);
      this.jDN.invalidate();
      GMTrace.o(5015850713088L, 37371);
      return;
      label873:
      this.jDN.setVisibility(8);
      this.jDO.setVisibility(8);
      this.jDJ.setBackgroundColor(getResources().getColor(R.e.aOz));
      GMTrace.o(5015850713088L, 37371);
      return;
      if ((paramk instanceof p))
      {
        du(false);
        localObject1 = (p)paramk;
        if (((p)localObject1).jzH != 0)
        {
          paramk = ((p)localObject1).jzI;
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dcf);
          }
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4960150355968L, 36956);
              paramAnonymousDialogInterface.dismiss();
              CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
              GMTrace.o(4960150355968L, 36956);
            }
          });
          this.jzR = ((p)localObject1).jzG;
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dcK));
        paramString = new Intent();
        paramString.putExtra("card_list", ((p)localObject1).jzG);
        setResult(-1, paramString);
        w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
        l.amU();
        finish();
        GMTrace.o(5015850713088L, 37371);
        return;
      }
      if ((paramk instanceof g))
      {
        du(false);
        paramString = ((g)paramk).jzG;
        paramInt1 = ((g)paramk).jzH;
        paramk = ((g)paramk).jzI;
        this.jzR = paramString;
        if (paramInt1 != 0)
        {
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.ddN);
          }
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4964713758720L, 36990);
              paramAnonymousDialogInterface.dismiss();
              CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
              GMTrace.o(4964713758720L, 36990);
            }
          });
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        com.tencent.mm.ui.base.h.bm(this, getResources().getString(R.l.dbW));
        paramk = new Intent();
        paramk.putExtra("card_list", this.jzR);
        setResult(-1, paramk);
        w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
        l.amW();
        paramk = new ShareCardInfo();
        f.a(paramk, paramString);
        l.a(paramk);
        al.aku().aic();
        finish();
        GMTrace.o(5015850713088L, 37371);
        return;
        w.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + paramk.getType() + "errType = " + paramInt1 + " errCode = " + paramInt2);
        du(false);
        d.b(this, paramString, paramInt2);
        if ((paramk instanceof p))
        {
          this.jzR = paramString;
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        if ((paramk instanceof g)) {
          this.jzR = "";
        }
      }
    }
  }
  
  void du(boolean paramBoolean)
  {
    GMTrace.i(5015716495360L, 37370);
    if (paramBoolean)
    {
      this.ihl = r.b(this, getString(R.l.bKJ), false, 0, null);
      GMTrace.o(5015716495360L, 37370);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(5015716495360L, 37370);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5015179624448L, 37366);
    int i = R.i.biT;
    GMTrace.o(5015179624448L, 37366);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5015448059904L, 37368);
    super.onCreate(paramBundle);
    at.wS().a(690, this);
    at.wS().a(687, this);
    at.wS().a(902, this);
    MP();
    GMTrace.o(5015448059904L, 37368);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5015582277632L, 37369);
    at.wS().b(690, this);
    at.wS().b(687, this);
    at.wS().b(902, this);
    this.jDR.clear();
    a locala = this.jDM;
    locala.jCF.clear();
    locala.mContext = null;
    super.onDestroy();
    GMTrace.o(5015582277632L, 37369);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5015984930816L, 37372);
    if (paramInt == 4)
    {
      w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
      lO(1);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5015984930816L, 37372);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardAcceptCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
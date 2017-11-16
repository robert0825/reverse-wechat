package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp;
import com.tencent.mm.plugin.card.a.i;
import com.tencent.mm.plugin.card.a.i.a;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.a;
import com.tencent.mm.plugin.card.model.ai;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class CardListSelectedUI
  extends MMActivity
  implements e, i.a
{
  private ListView Ev;
  private View iTN;
  private r ihl;
  com.tencent.mm.bm.b jAf;
  boolean jAg;
  private boolean jCP;
  private BaseAdapter jDh;
  private String jEc;
  private String jEd;
  private TextView jHE;
  private RelativeLayout jHF;
  private TextView jHG;
  private TextView jHH;
  boolean jHI;
  LinkedList<a> jHJ;
  HashMap<Integer, Boolean> jHK;
  private boolean jHL;
  private boolean jHM;
  private boolean jHN;
  private int jHO;
  private String jHP;
  private String jHQ;
  private String jHR;
  private String jHS;
  private int jHT;
  public String jHU;
  private boolean jHV;
  private a jHW;
  private int jtE;
  private String jxF;
  private String jxL;
  private int time_stamp;
  
  public CardListSelectedUI()
  {
    GMTrace.i(5011555745792L, 37339);
    this.ihl = null;
    this.jHI = false;
    this.jHJ = new LinkedList();
    this.jHK = new HashMap();
    this.jAg = true;
    this.jAf = null;
    this.jCP = false;
    this.jEc = "";
    this.jHV = false;
    this.jtE = 0;
    GMTrace.o(5011555745792L, 37339);
  }
  
  private void I(int paramInt, String paramString)
  {
    GMTrace.i(5013569011712L, 37354);
    if (this.jtE != 8)
    {
      w.e("MicroMsg.CardListSelectedUI", "setResultToSDK need MM_CARD_ITEM_FROM_SCENE_OPENAPI scene, the fromscene is " + this.jtE);
      GMTrace.o(5013569011712L, 37354);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_wxapi_choose_card_from_wx_card_list", paramString);
    Object localObject = g.aP(this.jxL, true);
    ChooseCardFromWXCardPackage.Resp localResp = new ChooseCardFromWXCardPackage.Resp(localBundle);
    if (localObject != null) {
      localResp.openId = ((f)localObject).field_openId;
    }
    localResp.transaction = this.jEd;
    String str2 = this.jxL;
    String str1;
    if (localObject == null)
    {
      str1 = "null appinfo";
      if (localObject != null) {
        break label285;
      }
      localObject = "null appinfo";
      label135:
      w.i("MicroMsg.CardListSelectedUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", new Object[] { str2, str1, localObject, this.jEd });
      localResp.toBundle(localBundle);
      w.i("MicroMsg.CardListSelectedUI", "setResultToSDK result:" + paramInt);
      w.d("MicroMsg.CardListSelectedUI", "setResultToSDK card_list:" + paramString);
      if (paramInt != -1) {
        break label295;
      }
    }
    label285:
    label295:
    for (localResp.errCode = 0;; localResp.errCode = -2)
    {
      paramString = new MMessageActV2.Args();
      paramString.targetPkgName = this.jEc;
      paramString.bundle = localBundle;
      p.ag(localBundle);
      p.ah(localBundle);
      MMessageActV2.send(ab.getContext(), paramString);
      GMTrace.o(5013569011712L, 37354);
      return;
      str1 = ((f)localObject).field_appName;
      break;
      localObject = ((f)localObject).field_openId;
      break label135;
    }
  }
  
  private void alR()
  {
    GMTrace.i(5011958398976L, 37342);
    if (this.jCP)
    {
      w.e("MicroMsg.CardListSelectedUI", "doNetSceneGetShareCardsLayout, isDoingGetData is true");
      GMTrace.o(5011958398976L, 37342);
      return;
    }
    if (this.jAf == null)
    {
      this.jHL = false;
      this.jHM = false;
      this.jHN = false;
    }
    at.wS().a(664, this);
    ai localai = new ai(this.jxL, this.jHO, this.jHP, this.jHQ, this.time_stamp, this.jHR, this.jxF, this.jHS, this.jAf);
    at.wS().a(localai, 0);
    du(true);
    this.jCP = true;
    if (this.jHT == 1) {
      this.jHI = true;
    }
    GMTrace.o(5011958398976L, 37342);
  }
  
  private String alS()
  {
    int j = 0;
    GMTrace.i(5013300576256L, 37352);
    Object localObject1 = new ArrayList();
    int i = 0;
    while (i < this.jHJ.size())
    {
      localObject2 = (Boolean)this.jHK.get(Integer.valueOf(i));
      if ((localObject2 != null) && (((Boolean)localObject2).booleanValue())) {
        ((ArrayList)localObject1).add(this.jHJ.get(i));
      }
      i += 1;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("[");
    i = j;
    while (i < ((ArrayList)localObject1).size())
    {
      if (i != 0) {
        ((StringBuilder)localObject2).append(",");
      }
      a locala = (a)((ArrayList)localObject1).get(i);
      ((StringBuilder)localObject2).append("{");
      ((StringBuilder)localObject2).append("\"card_id\":");
      ((StringBuilder)localObject2).append("\"" + locala.jxF + "\"");
      ((StringBuilder)localObject2).append(",");
      ((StringBuilder)localObject2).append("\"encrypt_code\":");
      ((StringBuilder)localObject2).append("\"" + locala.jxK + "\"");
      if (this.jHV)
      {
        ((StringBuilder)localObject2).append(",");
        ((StringBuilder)localObject2).append("\"app_id\":");
        ((StringBuilder)localObject2).append("\"" + locala.jxL + "\"");
      }
      ((StringBuilder)localObject2).append("}");
      i += 1;
    }
    ((StringBuilder)localObject2).append("]");
    localObject1 = ((StringBuilder)localObject2).toString();
    GMTrace.o(5013300576256L, 37352);
    return (String)localObject1;
  }
  
  private void als()
  {
    GMTrace.i(5013166358528L, 37351);
    Intent localIntent = new Intent();
    String str = alS();
    if (this.jHV) {
      localIntent.putExtra("choose_invoice_info", str);
    }
    for (;;)
    {
      setResult(-1, localIntent);
      I(-1, str);
      finish();
      GMTrace.o(5013166358528L, 37351);
      return;
      localIntent.putExtra("choose_card_info", str);
    }
  }
  
  private static String us(String paramString)
  {
    GMTrace.i(5012361052160L, 37345);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5012361052160L, 37345);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optString("rule_url");
      GMTrace.o(5012361052160L, 37345);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardListSelectedUI", paramString, "", new Object[0]);
      GMTrace.o(5012361052160L, 37345);
    }
    return null;
  }
  
  protected final void MP()
  {
    GMTrace.i(5012092616704L, 37343);
    if (this.jHV)
    {
      oM(R.l.dcV);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4963908452352L, 36984);
          CardListSelectedUI.this.setResult(0);
          CardListSelectedUI.a(CardListSelectedUI.this, "");
          CardListSelectedUI.this.finish();
          GMTrace.o(4963908452352L, 36984);
          return true;
        }
      });
      if (!this.jHV)
      {
        a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(4960687226880L, 36960);
            if ((!CardListSelectedUI.this.jHI) && (CardListSelectedUI.b(CardListSelectedUI.this).jxS))
            {
              CardListSelectedUI.this.du(true);
              al.akz().y(CardListSelectedUI.b(CardListSelectedUI.this).jxN, l.uK(CardListSelectedUI.b(CardListSelectedUI.this).userName), 3);
            }
            for (;;)
            {
              GMTrace.o(4960687226880L, 36960);
              return true;
              CardListSelectedUI.a(CardListSelectedUI.this);
            }
          }
        });
        lf(false);
      }
      this.Ev = ((ListView)findViewById(R.h.bkE));
      if (!this.jHV) {
        break label294;
      }
    }
    label294:
    for (this.jDh = new b();; this.jDh = new a())
    {
      this.Ev.setAdapter(this.jDh);
      this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5019474591744L, 37398);
          if (paramAnonymousView.getAlpha() != 1.0F)
          {
            w.d("MicroMsg.CardListSelectedUI", "item view is gray, cannot click, do nothing return！");
            GMTrace.o(5019474591744L, 37398);
            return;
          }
          boolean bool;
          if (CardListSelectedUI.this.jHI)
          {
            bool = ((Boolean)CardListSelectedUI.this.jHK.get(Integer.valueOf(paramAnonymousInt))).booleanValue();
            paramAnonymousAdapterView = CardListSelectedUI.this.jHK;
            if (!bool)
            {
              bool = true;
              paramAnonymousAdapterView.put(Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool));
            }
          }
          for (;;)
          {
            CardListSelectedUI.c(CardListSelectedUI.this).notifyDataSetChanged();
            CardListSelectedUI.d(CardListSelectedUI.this);
            GMTrace.o(5019474591744L, 37398);
            return;
            bool = false;
            break;
            int i = 0;
            while (i < CardListSelectedUI.this.jHJ.size())
            {
              CardListSelectedUI.this.jHK.put(Integer.valueOf(i), Boolean.valueOf(false));
              i += 1;
            }
            CardListSelectedUI.this.jHK.put(Integer.valueOf(paramAnonymousInt), Boolean.valueOf(true));
            CardListSelectedUI.a(CardListSelectedUI.this, (a)CardListSelectedUI.this.jHJ.get(paramAnonymousInt));
          }
        }
      });
      this.Ev.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(5009005608960L, 37320);
          if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (!CardListSelectedUI.this.jAg))
          {
            w.d("MicroMsg.CardListSelectedUI", "onScroll() >> doGetCardList()");
            CardListSelectedUI.e(CardListSelectedUI.this);
          }
          GMTrace.o(5009005608960L, 37320);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(5008871391232L, 37319);
          GMTrace.o(5008871391232L, 37319);
        }
      });
      this.iTN = findViewById(R.h.brV);
      this.jHE = ((TextView)findViewById(R.h.bRb));
      if (this.jHV) {
        this.jHE.setText(getString(R.l.ddu));
      }
      this.jHF = ((RelativeLayout)findViewById(R.h.bHW));
      this.jHG = ((TextView)findViewById(R.h.bIn));
      this.jHH = ((TextView)findViewById(R.h.bIi));
      if (!this.jHV) {
        break label309;
      }
      this.jHF.setVisibility(0);
      this.jHG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5000281456640L, 37255);
          if (!bg.nm(CardListSelectedUI.this.jHU)) {
            com.tencent.mm.plugin.card.b.b.a(CardListSelectedUI.this, CardListSelectedUI.this.jHU, CardListSelectedUI.this.getString(R.l.dcQ));
          }
          GMTrace.o(5000281456640L, 37255);
        }
      });
      this.jHH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5021890510848L, 37416);
          CardListSelectedUI.a(CardListSelectedUI.this);
          GMTrace.o(5021890510848L, 37416);
        }
      });
      GMTrace.o(5012092616704L, 37343);
      return;
      oM(R.l.dcU);
      break;
    }
    label309:
    this.jHF.setVisibility(8);
    GMTrace.o(5012092616704L, 37343);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5012226834432L, 37344);
    if ((paramk instanceof ai))
    {
      at.wS().b(664, this);
      du(false);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label400;
      }
      paramString = ((ai)paramk).jzG;
      w.d("MicroMsg.CardListSelectedUI", paramString);
      LinkedList localLinkedList1 = a.tS(paramString);
      LinkedList localLinkedList2 = a.tT(paramString);
      this.jHU = us(paramString);
      if ((this.jAf == null) && ((localLinkedList1 != null) || (localLinkedList2 != null)))
      {
        this.jHK.clear();
        this.jHJ.clear();
      }
      if (localLinkedList1 != null)
      {
        if ((localLinkedList1.size() > 0) && (!this.jHL))
        {
          this.jHL = true;
          if (!this.jHV) {
            break label209;
          }
        }
        label209:
        for (((a)localLinkedList1.get(0)).jty = getString(R.l.ddA);; ((a)localLinkedList1.get(0)).jty = getString(R.l.ddz))
        {
          paramInt1 = this.jHJ.size();
          this.jHJ.addAll(localLinkedList1);
          while (paramInt1 < this.jHJ.size())
          {
            this.jHK.put(Integer.valueOf(paramInt1), Boolean.valueOf(false));
            paramInt1 += 1;
          }
        }
      }
      if (localLinkedList2 != null)
      {
        if ((localLinkedList2.size() > 0) && (!this.jHM))
        {
          this.jHM = true;
          ((a)localLinkedList2.get(0)).jty = getString(R.l.cqQ);
        }
        paramInt1 = this.jHJ.size();
        this.jHJ.addAll(localLinkedList2);
        while (paramInt1 < this.jHJ.size())
        {
          this.jHK.put(Integer.valueOf(paramInt1), Boolean.valueOf(false));
          paramInt1 += 1;
        }
      }
      this.jAg = ((ai)paramk).jAg;
      this.jAf = ((ai)paramk).jAf;
      this.jDh.notifyDataSetChanged();
      if (this.jHJ.size() == 0) {
        break label409;
      }
      this.iTN.setVisibility(8);
      this.Ev.setVisibility(0);
    }
    for (;;)
    {
      this.jCP = false;
      GMTrace.o(5012226834432L, 37344);
      return;
      label400:
      d.b(this, paramString, paramInt2);
      break;
      label409:
      this.iTN.setVisibility(0);
      this.Ev.setVisibility(8);
    }
  }
  
  public final void b(String paramString, i.b paramb)
  {
    GMTrace.i(5012495269888L, 37346);
    du(false);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.jHW.jxN)))
    {
      w.e("MicroMsg.CardListSelectedUI", "onMarkSuccess(), the mark card id is diff from current id!");
      GMTrace.o(5012495269888L, 37346);
      return;
    }
    w.i("MicroMsg.CardListSelectedUI", "onMarkSuccess()");
    w.i("MicroMsg.CardListSelectedUI", "markSucc:" + paramb.jxt + " markCardId: " + paramb.jxu);
    if (paramb.jxt == 1)
    {
      int i;
      if ((!TextUtils.isEmpty(paramb.jxu)) && (!paramString.equals(paramb.jxu)))
      {
        w.i("MicroMsg.CardListSelectedUI", "markCardId is diff as now id!");
        i = 0;
        if (i < this.jHJ.size())
        {
          if (((a)this.jHJ.get(i)).jxN != paramb.jxu) {
            break label241;
          }
          int j = 0;
          while (j < this.jHJ.size())
          {
            this.jHK.put(Integer.valueOf(j), Boolean.valueOf(false));
            j += 1;
          }
          this.jHK.put(Integer.valueOf(i), Boolean.valueOf(true));
        }
      }
      for (;;)
      {
        als();
        GMTrace.o(5012495269888L, 37346);
        return;
        label241:
        i += 1;
        break;
        w.i("MicroMsg.CardListSelectedUI", "markCardId is same as now id!");
      }
    }
    d.b(this, getString(R.l.dda));
    GMTrace.o(5012495269888L, 37346);
  }
  
  public final void bz(String paramString1, String paramString2)
  {
    GMTrace.i(5012629487616L, 37347);
    du(false);
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.jHW.jxN)))
    {
      w.e("MicroMsg.CardListSelectedUI", "onMarkFail(), the mark card id is diff from current id!");
      GMTrace.o(5012629487616L, 37347);
      return;
    }
    w.i("MicroMsg.CardListSelectedUI", "onMarkFail()");
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = getString(R.l.dcZ);
    }
    d.b(this, paramString1);
    GMTrace.o(5012629487616L, 37347);
  }
  
  protected final void du(boolean paramBoolean)
  {
    GMTrace.i(5013032140800L, 37350);
    if (paramBoolean)
    {
      this.ihl = r.b(this, getString(R.l.bKJ), false, 0, null);
      GMTrace.o(5013032140800L, 37350);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(5013032140800L, 37350);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5011689963520L, 37340);
    int i = R.i.crl;
    GMTrace.o(5011689963520L, 37340);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5011824181248L, 37341);
    super.onCreate(paramBundle);
    al.akz().a(this);
    paramBundle = getIntent();
    w.i("MicroMsg.CardListSelectedUI", "initData()");
    if (paramBundle == null)
    {
      w.e("MicroMsg.CardListSelectedUI", "doGetCardList()  intent == null");
      setResult(1);
      I(1, "");
      finish();
    }
    for (;;)
    {
      alR();
      MP();
      GMTrace.o(5011824181248L, 37341);
      return;
      this.jtE = paramBundle.getIntExtra("key_from_scene", 0);
      w.i("MicroMsg.CardListSelectedUI", "mFromScene:" + this.jtE);
      this.jxL = paramBundle.getStringExtra("app_id");
      this.jHO = paramBundle.getIntExtra("shop_id", 0);
      this.jHP = paramBundle.getStringExtra("sign_type");
      this.jHQ = paramBundle.getStringExtra("card_sign");
      this.time_stamp = paramBundle.getIntExtra("time_stamp", 0);
      this.jHR = paramBundle.getStringExtra("nonce_str");
      this.jxF = paramBundle.getStringExtra("card_tp_id");
      this.jHS = paramBundle.getStringExtra("card_type");
      this.jHT = paramBundle.getIntExtra("can_multi_select", 0);
      this.jEc = paramBundle.getStringExtra("key_package_name");
      this.jEd = paramBundle.getStringExtra("key_transaction");
      w.i("MicroMsg.CardListSelectedUI", "app_id:" + this.jxL + " shop_id:" + this.jHO + " sign_type:" + this.jHP + " time_stamp:" + this.time_stamp);
      w.i("MicroMsg.CardListSelectedUI", "nonce_str:" + this.jHR + " card_tp_id:" + this.jxF + " card_type:" + this.jHS + " canMultiSelect:" + this.jHT + " packateName:" + this.jEc);
      if ("INVOICE".equalsIgnoreCase(this.jHS)) {
        this.jHV = true;
      }
      if ((TextUtils.isEmpty(this.jxL)) || (TextUtils.isEmpty(this.jHQ)))
      {
        w.e("MicroMsg.CardListSelectedUI", "doGetCardList()  app_id is nulls");
        setResult(1);
        I(1, "app_id  or card_sign is empty!");
        finish();
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5012897923072L, 37349);
    al.akz().b(this);
    super.onDestroy();
    GMTrace.o(5012897923072L, 37349);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5013434793984L, 37353);
    if (paramInt == 4)
    {
      setResult(0);
      I(0, "");
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5013434793984L, 37353);
    return bool;
  }
  
  public final void tP(String paramString)
  {
    GMTrace.i(5012763705344L, 37348);
    GMTrace.o(5012763705344L, 37348);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(4984980635648L, 37141);
      GMTrace.o(4984980635648L, 37141);
    }
    
    private a lS(int paramInt)
    {
      GMTrace.i(4985249071104L, 37143);
      a locala = (a)CardListSelectedUI.this.jHJ.get(paramInt);
      GMTrace.o(4985249071104L, 37143);
      return locala;
    }
    
    public final int getCount()
    {
      GMTrace.i(4985114853376L, 37142);
      int i = CardListSelectedUI.this.jHJ.size();
      GMTrace.o(4985114853376L, 37142);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(4985383288832L, 37144);
      long l = paramInt;
      GMTrace.o(4985383288832L, 37144);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4985517506560L, 37145);
      Object localObject = lS(paramInt);
      label197:
      label228:
      int i;
      if (paramView == null)
      {
        paramView = View.inflate(CardListSelectedUI.this, R.i.crw, null);
        paramViewGroup = new CardListSelectedUI.d(CardListSelectedUI.this);
        paramViewGroup.jIe = ((ImageView)paramView.findViewById(R.h.logo));
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.title));
        paramViewGroup.jIa = ((TextView)paramView.findViewById(R.h.cfZ));
        paramViewGroup.jIf = ((TextView)paramView.findViewById(R.h.bfi));
        paramViewGroup.jtq = ((TextView)paramView.findViewById(R.h.blV));
        paramViewGroup.jIg = paramView.findViewById(R.h.bhw);
        paramViewGroup.jIh = ((ImageView)paramView.findViewById(R.h.blw));
        paramView.setTag(paramViewGroup);
        if (!l.lE(((a)localObject).jxG)) {
          break label406;
        }
        paramViewGroup.ikm.setText(((a)localObject).jxI);
        if (TextUtils.isEmpty(((a)localObject).title)) {
          break label363;
        }
        paramViewGroup.jIa.setVisibility(0);
        paramViewGroup.jIa.setText(((a)localObject).title);
        if (TextUtils.isEmpty(((a)localObject).jxJ)) {
          break label375;
        }
        paramViewGroup.jIf.setVisibility(0);
        paramViewGroup.jIf.setText(((a)localObject).jxJ);
        TextView localTextView = paramViewGroup.jtq;
        if (!bg.nm(((a)localObject).jty)) {
          break label387;
        }
        i = 8;
        label249:
        localTextView.setVisibility(i);
        paramViewGroup.jtq.setText(((a)localObject).jty);
        i = CardListSelectedUI.this.getBaseContext().getResources().getDimensionPixelSize(R.f.aRy);
        CardListSelectedUI.a(paramViewGroup.jIe, ((a)localObject).jxH, i);
        localObject = (Boolean)CardListSelectedUI.this.jHK.get(Integer.valueOf(paramInt));
        if ((localObject == null) || (!((Boolean)localObject).booleanValue())) {
          break label393;
        }
        paramViewGroup.jIh.setImageResource(R.g.aUP);
      }
      for (;;)
      {
        GMTrace.o(4985517506560L, 37145);
        return paramView;
        paramViewGroup = (CardListSelectedUI.d)paramView.getTag();
        break;
        label363:
        paramViewGroup.jIa.setVisibility(8);
        break label197;
        label375:
        paramViewGroup.jIf.setVisibility(8);
        break label228;
        label387:
        i = 0;
        break label249;
        label393:
        paramViewGroup.jIh.setImageResource(R.g.aUQ);
        continue;
        label406:
        w.i("MicroMsg.CardListSelectedUI", "not support type");
      }
    }
  }
  
  final class b
    extends BaseAdapter
  {
    b()
    {
      GMTrace.i(5018266632192L, 37389);
      GMTrace.o(5018266632192L, 37389);
    }
    
    private a lS(int paramInt)
    {
      GMTrace.i(5018535067648L, 37391);
      a locala = (a)CardListSelectedUI.this.jHJ.get(paramInt);
      GMTrace.o(5018535067648L, 37391);
      return locala;
    }
    
    public final int getCount()
    {
      GMTrace.i(5018400849920L, 37390);
      int i = CardListSelectedUI.this.jHJ.size();
      GMTrace.o(5018400849920L, 37390);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5018669285376L, 37392);
      long l = paramInt;
      GMTrace.o(5018669285376L, 37392);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5018803503104L, 37393);
      a locala = lS(paramInt);
      if (paramView == null)
      {
        paramView = View.inflate(CardListSelectedUI.this, R.i.crv, null);
        paramViewGroup = new CardListSelectedUI.c(CardListSelectedUI.this);
        paramViewGroup.jHY = ((ImageView)paramView.findViewById(R.h.blw));
        paramViewGroup.jHZ = ((TextView)paramView.findViewById(R.h.bIh));
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.title));
        paramViewGroup.jIa = ((TextView)paramView.findViewById(R.h.cfZ));
        paramViewGroup.jIb = paramView.findViewById(R.h.cjO);
        paramViewGroup.jIc = ((TextView)paramView.findViewById(R.h.bIl));
        paramViewGroup.jId = ((TextView)paramView.findViewById(R.h.bHZ));
        paramView.setTag(paramViewGroup);
        if (!l.lE(locala.jxG)) {
          break label565;
        }
        if (TextUtils.isEmpty(locala.title)) {
          break label402;
        }
        paramViewGroup.ikm.setVisibility(0);
        paramViewGroup.ikm.setText(locala.title);
        label185:
        if (TextUtils.isEmpty(locala.jxI)) {
          break label414;
        }
        paramViewGroup.jIa.setVisibility(0);
        paramViewGroup.jIa.setText(locala.jxI);
        label216:
        if (locala.jxO != 0) {
          break label439;
        }
        paramView.setAlpha(1.0F);
        paramViewGroup.jHY.setVisibility(0);
        paramViewGroup.jHZ.setVisibility(8);
        Boolean localBoolean = (Boolean)CardListSelectedUI.this.jHK.get(Integer.valueOf(paramInt));
        if ((localBoolean == null) || (!localBoolean.booleanValue())) {
          break label426;
        }
        paramViewGroup.jHY.setImageResource(R.g.aUP);
        label288:
        if (bg.nm(locala.jxP)) {
          break label530;
        }
        paramViewGroup.jIc.setVisibility(0);
        paramViewGroup.jIc.setText(locala.jxP);
        label319:
        if (bg.nm(locala.jxQ)) {
          break label542;
        }
        paramViewGroup.jId.setVisibility(0);
        paramViewGroup.jId.setText(locala.jxQ);
        label350:
        if ((!bg.nm(locala.jxP)) || (!bg.nm(locala.jxQ))) {
          break label554;
        }
        paramViewGroup.jIb.setVisibility(8);
      }
      for (;;)
      {
        GMTrace.o(5018803503104L, 37393);
        return paramView;
        paramViewGroup = (CardListSelectedUI.c)paramView.getTag();
        break;
        label402:
        paramViewGroup.ikm.setVisibility(8);
        break label185;
        label414:
        paramViewGroup.jIa.setVisibility(8);
        break label216;
        label426:
        paramViewGroup.jHY.setImageResource(R.g.aUQ);
        break label288;
        label439:
        if (locala.jxO == 1)
        {
          paramView.setAlpha(0.2F);
          paramViewGroup.jHY.setVisibility(8);
          if (!bg.nm(locala.jxR))
          {
            paramViewGroup.jHZ.setVisibility(0);
            paramViewGroup.jHZ.setText(locala.jxR);
            break label288;
          }
          paramViewGroup.jHZ.setVisibility(8);
          break label288;
        }
        paramViewGroup.jHY.setVisibility(8);
        paramViewGroup.jHZ.setVisibility(8);
        break label288;
        label530:
        paramViewGroup.jIc.setVisibility(8);
        break label319;
        label542:
        paramViewGroup.jId.setVisibility(8);
        break label350;
        label554:
        paramViewGroup.jIb.setVisibility(0);
        continue;
        label565:
        w.i("MicroMsg.CardListSelectedUI", "not support type");
      }
    }
  }
  
  final class c
  {
    public TextView ikm;
    public ImageView jHY;
    public TextView jHZ;
    public TextView jIa;
    public View jIb;
    public TextView jIc;
    public TextView jId;
    
    c()
    {
      GMTrace.i(4928609189888L, 36721);
      GMTrace.o(4928609189888L, 36721);
    }
  }
  
  final class d
  {
    public TextView ikm;
    public TextView jIa;
    public ImageView jIe;
    public TextView jIf;
    public View jIg;
    public ImageView jIh;
    public TextView jtq;
    
    d()
    {
      GMTrace.i(4987530772480L, 37160);
      GMTrace.o(4987530772480L, 37160);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardListSelectedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
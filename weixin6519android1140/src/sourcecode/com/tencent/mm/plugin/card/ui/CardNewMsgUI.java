package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.k;
import com.tencent.mm.plugin.card.a.k.a;
import com.tencent.mm.plugin.card.b.b;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.g.a;
import com.tencent.mm.plugin.card.model.g.b;
import com.tencent.mm.plugin.card.model.h;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public class CardNewMsgUI
  extends MMActivity
  implements k.a
{
  private ListView Ev;
  View.OnClickListener hwh;
  private View iBW;
  private View iTN;
  private a jIp;
  private View jIq;
  private boolean jIr;
  
  public CardNewMsgUI()
  {
    GMTrace.i(5001757851648L, 37266);
    this.jIq = null;
    this.jIr = false;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4925387964416L, 36697);
        if (paramAnonymousView.getId() == R.h.byb)
        {
          paramAnonymousView = (com.tencent.mm.plugin.card.model.g)paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (paramAnonymousView.akd() == null))
          {
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(2), paramAnonymousView.field_card_id, paramAnonymousView.field_card_tp_id, paramAnonymousView.field_msg_id, "" });
          if (paramAnonymousView.akd().jzr == 0)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
            if (!TextUtils.isEmpty(paramAnonymousView.akd().url))
            {
              b.a(CardNewMsgUI.this, paramAnonymousView.akd().url, 2);
              GMTrace.o(4925387964416L, 36697);
              return;
            }
            w.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.akd().jzr == 1)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
            Intent localIntent = new Intent();
            localIntent.putExtra("KEY_CARD_ID", paramAnonymousView.field_card_id);
            localIntent.putExtra("KEY_CARD_TP_ID", paramAnonymousView.field_card_tp_id);
            localIntent.setClass(CardNewMsgUI.this, CardShopUI.class);
            CardNewMsgUI.this.startActivity(localIntent);
            com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "UsedStoresView", Integer.valueOf(paramAnonymousView.field_card_type), paramAnonymousView.field_card_tp_id, paramAnonymousView.field_card_id, Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
          }
          GMTrace.o(4925387964416L, 36697);
          return;
        }
        if (paramAnonymousView.getId() == R.h.bSu)
        {
          paramAnonymousView = (com.tencent.mm.plugin.card.model.g)paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (paramAnonymousView.ake() == null))
          {
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.ake().type == 0)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
            if (!TextUtils.isEmpty(paramAnonymousView.ake().url))
            {
              b.a(CardNewMsgUI.this, paramAnonymousView.ake().url, 2);
              GMTrace.o(4925387964416L, 36697);
              return;
            }
            w.e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.ake().type == 1) {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
          }
        }
        GMTrace.o(4925387964416L, 36697);
      }
    };
    GMTrace.o(5001757851648L, 37266);
  }
  
  private void S(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5002563158016L, 37272);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramString);
    localIntent.putExtra("key_is_share_card", paramBoolean);
    localIntent.putExtra("key_from_scene", 4);
    startActivity(localIntent);
    GMTrace.o(5002563158016L, 37272);
  }
  
  private void akN()
  {
    GMTrace.i(5002428940288L, 37271);
    k localk = al.akr();
    int i;
    if ((localk.jxx == null) || (localk.jxx.isEmpty()))
    {
      i = 0;
      if (i <= 0) {
        break label88;
      }
      this.Ev.setVisibility(0);
      this.iTN.setVisibility(8);
      lf(true);
    }
    for (;;)
    {
      this.jIp.notifyDataSetChanged();
      GMTrace.o(5002428940288L, 37271);
      return;
      i = localk.jxx.size();
      break;
      label88:
      this.Ev.setVisibility(8);
      this.iTN.setVisibility(0);
      lf(false);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(5002294722560L, 37270);
    oM(R.l.ddk);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5000013021184L, 37253);
        CardNewMsgUI.this.finish();
        GMTrace.o(5000013021184L, 37253);
        return true;
      }
    });
    this.Ev = ((ListView)findViewById(R.h.bkV));
    this.jIp = new a();
    this.Ev.setAdapter(this.jIp);
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4988067643392L, 37164);
        if (paramAnonymousInt == CardNewMsgUI.a(CardNewMsgUI.this).getCount())
        {
          paramAnonymousInt = 1;
          if (al.akp().ME() > 0) {
            al.akp().aki();
          }
          for (;;)
          {
            CardNewMsgUI.a(CardNewMsgUI.this).a(null, null);
            if (!CardNewMsgUI.b(CardNewMsgUI.this))
            {
              if (CardNewMsgUI.c(CardNewMsgUI.this).getParent() != null)
              {
                w.d("MicroMsg.CardNewMsgUI", "remove footer");
                CardNewMsgUI.d(CardNewMsgUI.this).removeFooterView(CardNewMsgUI.c(CardNewMsgUI.this));
              }
              if ((!CardNewMsgUI.a(CardNewMsgUI.this).alU()) && (CardNewMsgUI.e(CardNewMsgUI.this).getParent() == null) && (paramAnonymousInt > 0))
              {
                CardNewMsgUI.d(CardNewMsgUI.this).addFooterView(CardNewMsgUI.e(CardNewMsgUI.this));
                w.i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
              }
            }
            CardNewMsgUI.f(CardNewMsgUI.this);
            CardNewMsgUI.c(CardNewMsgUI.this).setVisibility(8);
            GMTrace.o(4988067643392L, 37164);
            return;
            paramAnonymousInt = CardNewMsgUI.a(CardNewMsgUI.this).alV();
          }
        }
        CardNewMsgUI.a(CardNewMsgUI.this, paramAnonymousInt);
        GMTrace.o(4988067643392L, 37164);
      }
    });
    this.Ev.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5030212009984L, 37478);
        CardNewMsgUI.b(CardNewMsgUI.this, paramAnonymousInt);
        GMTrace.o(5030212009984L, 37478);
        return true;
      }
    });
    this.Ev.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(4938809737216L, 36797);
        GMTrace.o(4938809737216L, 36797);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(4938675519488L, 36796);
        if (!CardNewMsgUI.b(CardNewMsgUI.this))
        {
          GMTrace.o(4938675519488L, 36796);
          return;
        }
        if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
        {
          if (al.akp().ME() > 0) {
            al.akp().aki();
          }
          for (;;)
          {
            CardNewMsgUI.a(CardNewMsgUI.this).a(null, null);
            GMTrace.o(4938675519488L, 36796);
            return;
            CardNewMsgUI.a(CardNewMsgUI.this).alV();
          }
        }
        GMTrace.o(4938675519488L, 36796);
      }
    });
    this.jIp.vKu = new o.a()
    {
      public final void QC()
      {
        GMTrace.i(5009945133056L, 37327);
        CardNewMsgUI.g(CardNewMsgUI.this);
        if ((CardNewMsgUI.a(CardNewMsgUI.this).alU()) && (al.akp().ME() == 0)) {
          CardNewMsgUI.c(CardNewMsgUI.this).setVisibility(8);
        }
        GMTrace.o(5009945133056L, 37327);
      }
      
      public final void QD()
      {
        GMTrace.i(5009810915328L, 37326);
        GMTrace.o(5009810915328L, 37326);
      }
    };
    a(0, getString(R.l.dcj), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5030748880896L, 37482);
        com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "CardMsgClearMenu", Integer.valueOf(2), Integer.valueOf(0), "", "", "" });
        CardNewMsgUI.h(CardNewMsgUI.this);
        GMTrace.o(5030748880896L, 37482);
        return true;
      }
    });
    this.iTN = findViewById(R.h.brV);
    akN();
    this.iBW = v.fb(this).inflate(R.i.crn, null);
    this.jIq = v.fb(this).inflate(R.i.cBz, null);
    int i = al.akp().ME();
    if (i > 0)
    {
      this.Ev.addFooterView(this.iBW);
      GMTrace.o(5002294722560L, 37270);
      return;
    }
    if ((!this.jIp.alU()) && (i == 0) && (al.akp().getCount() > 0))
    {
      this.Ev.addFooterView(this.jIq);
      this.jIr = true;
      GMTrace.o(5002294722560L, 37270);
      return;
    }
    if ((this.jIp.alU()) && (i == 0)) {
      al.akp().getCount();
    }
    GMTrace.o(5002294722560L, 37270);
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(5002697375744L, 37273);
    if (((paramg.field_msg_type & 0x1) == 0) || ((paramg.field_msg_type & 0x3) == 0))
    {
      GMTrace.o(5002697375744L, 37273);
      return;
    }
    akN();
    this.jIp.a(null, null);
    GMTrace.o(5002697375744L, 37273);
  }
  
  public final void aic()
  {
    GMTrace.i(5002831593472L, 37274);
    GMTrace.o(5002831593472L, 37274);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5001892069376L, 37267);
    int i = R.i.crq;
    GMTrace.o(5001892069376L, 37267);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5002026287104L, 37268);
    super.onCreate(paramBundle);
    MP();
    al.akr().a(this);
    al.akr().aka();
    GMTrace.o(5002026287104L, 37268);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5002160504832L, 37269);
    this.jIp.aJe();
    al.akr().b(this);
    if (al.akp().ME() > 0) {
      al.akp().aki();
    }
    super.onDestroy();
    GMTrace.o(5002160504832L, 37269);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.card.model.g>
  {
    private int gQB;
    private int jIt;
    
    public a()
    {
      super(new com.tencent.mm.plugin.card.model.g());
      GMTrace.i(4927535448064L, 36713);
      this.jIt = 10;
      this.gQB = this.jIt;
      lb(true);
      GMTrace.o(4927535448064L, 36713);
    }
    
    private void a(List<g.a> paramList, List<g.b> paramList1, CardNewMsgUI.b paramb, final com.tencent.mm.plugin.card.model.g paramg)
    {
      GMTrace.i(4928340754432L, 36719);
      paramb.jII.removeAllViews();
      if (((paramList == null) || (paramList.size() == 0)) && ((paramList1 == null) || (paramList1.size() == 0)))
      {
        paramb.jIJ.setVisibility(8);
        GMTrace.o(4928340754432L, 36719);
        return;
      }
      int i;
      final Object localObject1;
      Object localObject2;
      if (!bg.cc(paramList))
      {
        i = 0;
        if (i < paramList.size())
        {
          localObject1 = (g.a)paramList.get(i);
          localObject2 = View.inflate(CardNewMsgUI.this.vKB.vKW, R.i.cqC, null);
          if (i == 0) {
            ((View)localObject2).findViewById(R.h.biQ).setVisibility(8);
          }
          ((TextView)((View)localObject2).findViewById(R.h.biS)).setText(((g.a)localObject1).title);
          ((TextView)((View)localObject2).findViewById(R.h.biR)).setText(((g.a)localObject1).jzo);
          Button localButton = (Button)((View)localObject2).findViewById(R.h.biP);
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(5022427381760L, 37420);
              paramAnonymousView = new Intent();
              if (localObject1.jzr == 0)
              {
                paramAnonymousView.setClass(CardNewMsgUI.this.vKB.vKW, CardDetailUI.class);
                paramAnonymousView.putExtra("key_card_id", localObject1.cardId);
                paramAnonymousView.putExtra("key_card_ext", localObject1.jzp);
                paramAnonymousView.putExtra("key_from_scene", 17);
                CardNewMsgUI.this.startActivity(paramAnonymousView);
              }
              for (;;)
              {
                com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(8), paramg.field_card_id, paramg.field_card_tp_id, paramg.field_msg_id, localObject1.cardId });
                GMTrace.o(5022427381760L, 37420);
                return;
                if (localObject1.jzr == 1)
                {
                  paramAnonymousView.setClass(CardNewMsgUI.this.vKB.vKW, CardConsumeSuccessUI.class);
                  paramAnonymousView.putExtra("key_card_id", paramg.field_card_id);
                  paramAnonymousView.putExtra("key_from_scene", 2);
                  CardNewMsgUI.this.startActivity(paramAnonymousView);
                }
              }
            }
          });
          if (((g.a)localObject1).jzr == 0) {
            localButton.setText(R.l.biS);
          }
          for (;;)
          {
            paramb.jII.addView((View)localObject2);
            i += 1;
            break;
            if (((g.a)localObject1).jzr == 1) {
              localButton.setText(R.l.dbP);
            }
          }
        }
      }
      if (!bg.cc(paramList1))
      {
        i = 0;
        while (i < paramList1.size())
        {
          paramg = (g.b)paramList1.get(i);
          localObject1 = View.inflate(CardNewMsgUI.this.vKB.vKW, R.i.cqC, null);
          if ((i == 0) && (bg.cc(paramList))) {
            ((View)localObject1).findViewById(R.h.biQ).setVisibility(8);
          }
          ((TextView)((View)localObject1).findViewById(R.h.biS)).setText(paramg.title);
          ((TextView)((View)localObject1).findViewById(R.h.biR)).setText(paramg.description);
          localObject2 = (Button)((View)localObject1).findViewById(R.h.biP);
          ((Button)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(4938407084032L, 36794);
              if (!TextUtils.isEmpty(paramg.jzu))
              {
                b.a(CardNewMsgUI.this, paramg.jzu, 2);
                GMTrace.o(4938407084032L, 36794);
                return;
              }
              w.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
              GMTrace.o(4938407084032L, 36794);
            }
          });
          ((Button)localObject2).setText(paramg.jzt);
          paramb.jII.addView((View)localObject1);
          i += 1;
        }
      }
      paramb.jIJ.setVisibility(0);
      GMTrace.o(4928340754432L, 36719);
    }
    
    public final void QF()
    {
      GMTrace.i(4927669665792L, 36714);
      if (al.akp().ME() > 0) {
        setCursor(al.akp().fTZ.rawQuery("select * from CardMsgInfo where read_state = ?  order by time desc", new String[] { "1" }));
      }
      for (;;)
      {
        notifyDataSetChanged();
        GMTrace.o(4927669665792L, 36714);
        return;
        this.gQB = al.akp().getCount();
        h localh = al.akp();
        int i = this.jIt;
        String str = "select * from CardMsgInfo order by time desc LIMIT " + i;
        setCursor(localh.fTZ.rawQuery(str, null));
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(4927803883520L, 36715);
      aJe();
      QF();
      GMTrace.o(4927803883520L, 36715);
    }
    
    public final boolean alU()
    {
      GMTrace.i(4927938101248L, 36716);
      if (this.jIt >= this.gQB)
      {
        GMTrace.o(4927938101248L, 36716);
        return true;
      }
      GMTrace.o(4927938101248L, 36716);
      return false;
    }
    
    public final int alV()
    {
      GMTrace.i(4928072318976L, 36717);
      if (alU())
      {
        if (CardNewMsgUI.e(CardNewMsgUI.this).getParent() != null) {
          CardNewMsgUI.d(CardNewMsgUI.this).removeFooterView(CardNewMsgUI.e(CardNewMsgUI.this));
        }
        GMTrace.o(4928072318976L, 36717);
        return 0;
      }
      this.jIt += 10;
      if (this.jIt <= this.gQB)
      {
        GMTrace.o(4928072318976L, 36717);
        return 10;
      }
      this.jIt = this.gQB;
      int i = this.gQB;
      GMTrace.o(4928072318976L, 36717);
      return i % 10;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4928206536704L, 36718);
      com.tencent.mm.plugin.card.model.g localg = (com.tencent.mm.plugin.card.model.g)getItem(paramInt);
      int i;
      if (paramView == null)
      {
        paramView = View.inflate(CardNewMsgUI.this.vKB.vKW, R.i.cro, null);
        paramViewGroup = new CardNewMsgUI.b(CardNewMsgUI.this);
        paramViewGroup.jIy = ((ImageView)paramView.findViewById(R.h.logo));
        paramViewGroup.jIz = paramView.findViewById(R.h.blQ);
        paramViewGroup.jIA = ((ImageView)paramView.findViewById(R.h.blP));
        paramViewGroup.jIB = ((TextView)paramView.findViewById(R.h.chT));
        paramViewGroup.jIC = ((TextView)paramView.findViewById(R.h.cho));
        paramViewGroup.jID = ((TextView)paramView.findViewById(R.h.btj));
        paramViewGroup.jIE = ((TextView)paramView.findViewById(R.h.byb));
        paramViewGroup.jIF = ((TextView)paramView.findViewById(R.h.cfC));
        paramViewGroup.jIG = paramView.findViewById(R.h.bSu);
        paramViewGroup.jIH = ((TextView)paramView.findViewById(R.h.bSv));
        paramViewGroup.jII = ((LinearLayout)paramView.findViewById(R.h.bcp));
        paramViewGroup.jIJ = ((LinearLayout)paramView.findViewById(R.h.bcq));
        paramView.setTag(paramViewGroup);
        paramViewGroup.jIB.setText(localg.field_title);
        long l = localg.field_time;
        paramViewGroup.jIC.setText(n.c(CardNewMsgUI.this, l * 1000L, true));
        paramViewGroup.jID.setText(localg.field_description);
        i = CardNewMsgUI.this.getResources().getDimensionPixelSize(R.f.aRu);
        w.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " logo_url :  " + localg.field_logo_url);
        if (!TextUtils.isEmpty(localg.field_logo_color)) {
          break label570;
        }
        paramViewGroup.jIz.setVisibility(8);
        paramViewGroup.jIy.setVisibility(0);
        paramViewGroup.jIy.setImageResource(R.g.aYg);
        m.a(paramViewGroup.jIy, localg.field_logo_url, i, R.g.aYg, true);
        label381:
        Object localObject = localg.akd();
        if ((localObject == null) || (TextUtils.isEmpty(((jk)localObject).text))) {
          break label688;
        }
        paramViewGroup.jIE.setText(((jk)localObject).text);
        paramViewGroup.jIE.setTag(localg);
        paramViewGroup.jIE.setVisibility(0);
        paramViewGroup.jIE.setOnClickListener(CardNewMsgUI.this.hwh);
        label447:
        localObject = localg.ake();
        if ((localObject == null) || (TextUtils.isEmpty(((jo)localObject).text))) {
          break label700;
        }
        paramViewGroup.jIH.setText(((jo)localObject).text);
        paramViewGroup.jIG.setVisibility(0);
        paramViewGroup.jIG.setOnClickListener(CardNewMsgUI.this.hwh);
        paramViewGroup.jIG.setTag(localg);
        paramViewGroup.jIF.setVisibility(0);
      }
      for (;;)
      {
        localg.akf();
        localg.akg();
        a(localg.jzi, localg.jzj, paramViewGroup, localg);
        GMTrace.o(4928206536704L, 36718);
        return paramView;
        paramViewGroup = (CardNewMsgUI.b)paramView.getTag();
        break;
        label570:
        w.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " field_logo_color :  " + localg.field_logo_color);
        paramViewGroup.jIz.setVisibility(0);
        paramViewGroup.jIy.setVisibility(8);
        if (!TextUtils.isEmpty(localg.field_logo_url))
        {
          m.a(CardNewMsgUI.this, paramViewGroup.jIA, localg.field_logo_url, i, R.g.aUZ, l.uD(localg.field_logo_color));
          break label381;
        }
        m.a(paramViewGroup.jIA, R.g.aUZ, l.uD(localg.field_logo_color));
        break label381;
        label688:
        paramViewGroup.jIE.setVisibility(8);
        break label447;
        label700:
        paramViewGroup.jIG.setVisibility(8);
        paramViewGroup.jIF.setVisibility(8);
      }
    }
  }
  
  private final class b
  {
    ImageView jIA;
    TextView jIB;
    TextView jIC;
    TextView jID;
    TextView jIE;
    TextView jIF;
    View jIG;
    TextView jIH;
    LinearLayout jII;
    LinearLayout jIJ;
    ImageView jIy;
    View jIz;
    
    public b()
    {
      GMTrace.i(5009139826688L, 37321);
      GMTrace.o(5009139826688L, 37321);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardNewMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
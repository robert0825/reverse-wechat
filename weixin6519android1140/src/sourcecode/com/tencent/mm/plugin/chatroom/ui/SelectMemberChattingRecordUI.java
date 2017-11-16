package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;
import java.util.Map;

public class SelectMemberChattingRecordUI
  extends MMActivity
{
  private static final f<Integer, com.tencent.mm.protocal.b.a.c> gli;
  private r ihl;
  private String jOR;
  private MMLoadMoreListView jRn;
  private View jRo;
  private a jRp;
  private String jRq;
  private int jtJ;
  private String mTitle;
  
  static
  {
    GMTrace.i(9152441090048L, 68191);
    gli = new f(32);
    GMTrace.o(9152441090048L, 68191);
  }
  
  public SelectMemberChattingRecordUI()
  {
    GMTrace.i(9150964695040L, 68180);
    this.jtJ = 0;
    GMTrace.o(9150964695040L, 68180);
  }
  
  public static String a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(9151770001408L, 68186);
    String str = "";
    f.a locala = f.a.eS(paramString1);
    Object localObject;
    switch (paramInt1)
    {
    default: 
      localObject = str;
    case 1: 
    case 34: 
    case 3: 
    case 23: 
    case 33: 
    case 43: 
    case 62: 
    case 48: 
    case 42: 
      label216:
      do
      {
        for (;;)
        {
          GMTrace.o(9151770001408L, 68186);
          return (String)localObject;
          localObject = paramString1.substring(paramString1.indexOf(":\n") + 1);
          continue;
          paramString1 = new com.tencent.mm.modelvoice.n(paramString1);
          localObject = paramContext.getString(R.l.dQv, new Object[] { Integer.valueOf((int)com.tencent.mm.modelvoice.q.aD(paramString1.time)) });
          continue;
          localObject = paramContext.getString(R.l.cUb);
          continue;
          if (62 == paramInt1) {}
          for (paramInt1 = R.l.cUz;; paramInt1 = R.l.cUP)
          {
            localObject = paramContext.getString(paramInt1);
            break;
          }
          at.AR();
          paramString1 = com.tencent.mm.y.c.yM().Co(paramString1);
          localObject = paramContext.getString(R.l.dQn, new Object[] { paramString1.label });
        }
        localObject = str;
      } while (bg.nl(paramString1).length() <= 0);
      localObject = bc.gP(paramString1);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break;
      }
    }
    for (;;)
    {
      at.AR();
      localObject = com.tencent.mm.y.c.yM().Cn(paramString1);
      at.AR();
      paramString2 = com.tencent.mm.y.c.yK().TE(paramString2).vk();
      paramString1 = paramString2;
      if (s.eb(paramString2)) {
        paramString1 = m.t(m.fl(paramString2));
      }
      if (paramInt2 == 1)
      {
        localObject = paramContext.getString(R.l.dwu, new Object[] { paramString1, ((au.a)localObject).getDisplayName() });
        break;
      }
      localObject = paramContext.getString(R.l.dwv, new Object[] { paramString1, ((au.a)localObject).getDisplayName() });
      break;
      if (locala == null)
      {
        w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
        GMTrace.o(9151770001408L, 68186);
        return "";
      }
      localObject = str;
      switch (locala.type)
      {
      case 7: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 16: 
      case 18: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      default: 
        localObject = "";
        break;
      case 6: 
        localObject = paramContext.getString(R.l.dQm, new Object[] { locala.title });
        break;
      case 5: 
        localObject = paramContext.getString(R.l.dQt, new Object[] { locala.getTitle() });
        break;
      case 8: 
        localObject = paramContext.getString(R.l.cSE);
        break;
      case 15: 
      case 26: 
      case 27: 
        localObject = paramContext.getString(R.l.cSD);
        break;
      case 25: 
        localObject = paramContext.getString(R.l.cSv);
        break;
      case 17: 
        localObject = paramContext.getString(R.l.dQn, new Object[] { locala.title });
        break;
      case 19: 
        localObject = paramContext.getString(R.l.dQq, new Object[] { locala.title });
        break;
      case 24: 
        paramString2 = locala.giV;
        if (bg.nm(paramString2))
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "xml is null");
          paramString1 = null;
          if (paramString1 != null) {
            break label1028;
          }
        }
        for (paramString1 = "";; paramString1 = paramString1.desc)
        {
          localObject = paramContext.getString(R.l.dQp, new Object[] { bg.aq(paramString1, "") });
          break;
          paramInt1 = paramString2.hashCode();
          paramString1 = (com.tencent.mm.protocal.b.a.c)gli.get(Integer.valueOf(paramInt1));
          if (paramString1 != null)
          {
            w.d("MicroMsg.SelectMemberChattingRecordUI", "get record msg data from cache");
            break label810;
          }
          if (paramString2.trim().startsWith("<recordinfo>")) {}
          for (paramString1 = bh.q(paramString2, "recordinfo");; paramString1 = bh.q("<recordinfo>" + paramString2 + "</recordinfo>", "recordinfo"))
          {
            if (paramString1 != null) {
              break label955;
            }
            w.e("MicroMsg.SelectMemberChattingRecordUI", "values is null: %s", new Object[] { paramString2 });
            paramString1 = null;
            break;
          }
          paramString2 = new com.tencent.mm.protocal.b.a.c();
          paramString2.title = ((String)paramString1.get(".recordinfo.title"));
          paramString2.desc = ((String)paramString1.get(".recordinfo.desc"));
          paramString2.tLW = ((String)paramString1.get(".recordinfo.favusername"));
          gli.put(Integer.valueOf(paramInt1), paramString2);
          paramString1 = paramString2;
          break label810;
        }
      case 3: 
        localObject = paramContext.getString(R.l.dQo, new Object[] { locala.title });
        break;
      case 4: 
        localObject = paramContext.getString(R.l.dQu, new Object[] { locala.title });
        break;
      case 2: 
        label810:
        label955:
        label1028:
        localObject = paramContext.getString(R.l.cUb);
        break;
        localObject = paramContext.getString(R.l.cSD);
        break;
        localObject = paramContext.getString(R.l.dQr);
        if (locala == null) {
          break;
        }
        if (paramInt2 == 1) {}
        for (paramInt1 = 1;; paramInt1 = 0) {
          switch (locala.gjx)
          {
          case 2: 
          default: 
            localObject = bg.nl(locala.title);
            break label216;
          }
        }
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.cUZ);
          break;
        }
        localObject = paramContext.getString(R.l.cVc);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.cVa);
          break;
        }
        localObject = paramContext.getString(R.l.cUX);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.cVb);
          break;
        }
        localObject = paramContext.getString(R.l.cUY);
        break;
        if (locala == null)
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
          GMTrace.o(9151770001408L, 68186);
          return "";
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(R.l.dQj, new Object[] { locala.gjY, locala.gjV });
          break;
        }
        localObject = paramContext.getString(R.l.dQj, new Object[] { locala.gjY, locala.gjU });
        break;
        if (locala == null)
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
          GMTrace.o(9151770001408L, 68186);
          return "";
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(R.l.dQj, new Object[] { locala.gjY, locala.gkm });
          break;
        }
        localObject = paramContext.getString(R.l.dQj, new Object[] { locala.gjY, locala.gkl });
        break;
        localObject = paramContext.getString(R.l.dQk, new Object[] { locala.title });
        break;
        localObject = paramContext.getString(R.l.dQk, new Object[] { "" });
        break;
        localObject = paramContext.getString(R.l.dQi, new Object[] { locala.title });
        break;
        localObject = paramContext.getString(R.l.dQs, new Object[] { locala.title });
        break;
        localObject = str;
        if (paramString1 == null) {
          break;
        }
        localObject = str;
        if (paramString1.length() <= 0) {
          break;
        }
        paramString1 = au.d.Uk(paramString1);
        localObject = str;
        if (paramString1.rAP == null) {
          break;
        }
        localObject = str;
        if (paramString1.rAP.length() <= 0) {
          break;
        }
        switch (paramString1.scene)
        {
        case 19: 
        case 20: 
        case 21: 
        default: 
          localObject = paramContext.getString(R.l.dxs, new Object[] { paramString1.getDisplayName() });
          break;
        case 18: 
          localObject = paramContext.getString(R.l.dxc, new Object[] { paramString1.getDisplayName() });
          break;
        case 22: 
        case 23: 
        case 24: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
          localObject = paramContext.getString(R.l.dxm, new Object[] { paramString1.getDisplayName() });
          break;
        case 25: 
          localObject = paramContext.getString(R.l.dwt, new Object[] { paramString1.getDisplayName() });
          break;
          paramString2 = (String)localObject;
        }
        break;
      }
    }
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(9151501565952L, 68184);
    if (paramq == null)
    {
      GMTrace.o(9151501565952L, 68184);
      return null;
    }
    paramq = paramq.fs(paramString);
    GMTrace.o(9151501565952L, 68184);
    return paramq;
  }
  
  protected final void MP()
  {
    GMTrace.i(9151367348224L, 68183);
    super.MP();
    sq(bg.nl(this.mTitle));
    this.jRn = ((MMLoadMoreListView)findViewById(R.h.bML));
    this.jRn.bZZ();
    this.jRp = new a(this, this.jOR, this.jRq, this.jtJ);
    this.jRn.setAdapter(this.jRp);
    this.jRo = findViewById(R.h.cbG);
    if (this.jtJ == 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.jRo.setVisibility(0);
        this.jRn.setVisibility(8);
      }
      this.jRn.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(9156333404160L, 68220);
          paramAnonymousAdapterView = (au)SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousAdapterView != null) {
            SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this, paramAnonymousAdapterView.field_msgId);
          }
          GMTrace.o(9156333404160L, 68220);
        }
      });
      this.jRn.wdv = new MMLoadMoreListView.a()
      {
        public final void anO()
        {
          GMTrace.i(9102780530688L, 67821);
          SelectMemberChattingRecordUI.a locala;
          if (SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this) != null)
          {
            locala = SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this);
            locala.jRt -= 16;
            if ((bg.nm(SelectMemberChattingRecordUI.c(locala.jRr))) || (!com.tencent.mm.y.q.fp(SelectMemberChattingRecordUI.c(locala.jRr)))) {
              break label111;
            }
            at.AR();
            locala.setCursor(com.tencent.mm.y.c.yM().br(locala.iGc, locala.gQB - locala.jRt));
          }
          for (;;)
          {
            SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this).notifyDataSetChanged();
            GMTrace.o(9102780530688L, 67821);
            return;
            label111:
            if (!com.tencent.mm.y.q.fp(SelectMemberChattingRecordUI.c(locala.jRr)))
            {
              at.AR();
              locala.setCursor(com.tencent.mm.y.c.yM().B(locala.iGc, locala.jRs, locala.gQB - locala.jRt));
            }
          }
        }
      };
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9073118412800L, 67600);
          SelectMemberChattingRecordUI.this.setResult(0);
          SelectMemberChattingRecordUI.this.finish();
          GMTrace.o(9073118412800L, 67600);
          return true;
        }
      });
      GMTrace.o(9151367348224L, 68183);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9151635783680L, 68185);
    int i = R.i.cFI;
    GMTrace.o(9151635783680L, 68185);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9151098912768L, 68181);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SelectMemberChattingRecordUI", "[onCreate]");
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    this.jRq = getIntent().getStringExtra("room_member");
    w.i("MicroMsg.SelectMemberChattingRecordUI", "roomId:%s", new Object[] { this.jOR });
    this.mTitle = getIntent().getStringExtra("title");
    if ((!bg.nm(this.jRq)) && (com.tencent.mm.y.q.fp(this.jRq)))
    {
      at.AR();
      this.jtJ = com.tencent.mm.y.c.yM().Cy(this.jOR);
    }
    for (;;)
    {
      MP();
      GMTrace.o(9151098912768L, 68181);
      return;
      if (!com.tencent.mm.y.q.fp(this.jRq))
      {
        at.AR();
        this.jtJ = com.tencent.mm.y.c.yM().cU(this.jOR, this.jRq);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9151233130496L, 68182);
    super.onDestroy();
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    GMTrace.o(9151233130496L, 68182);
  }
  
  public final class a
    extends o<au>
  {
    int gQB;
    String iGc;
    String jRs;
    int jRt;
    private com.tencent.mm.storage.q jRu;
    Context mContext;
    
    public a(Context paramContext, String paramString1, String paramString2, int paramInt)
    {
      super(new au());
      GMTrace.i(9129489858560L, 68020);
      this.jRt = -1;
      this.gQB = -1;
      this.mContext = paramContext;
      this.gQB = paramInt;
      this.iGc = paramString1;
      this.jRs = paramString2;
      at.AR();
      this.jRu = com.tencent.mm.y.c.yT().gD(SelectMemberChattingRecordUI.b(SelectMemberChattingRecordUI.this));
      GMTrace.o(9129489858560L, 68020);
    }
    
    private static boolean a(CharSequence paramCharSequence, TextView paramTextView)
    {
      GMTrace.i(9130026729472L, 68024);
      if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
      {
        paramTextView.setText(h.a(paramTextView.getContext(), paramCharSequence));
        paramTextView.setVisibility(0);
        GMTrace.o(9130026729472L, 68024);
        return true;
      }
      paramTextView.setVisibility(8);
      GMTrace.o(9130026729472L, 68024);
      return false;
    }
    
    public final void QF()
    {
      GMTrace.i(9129624076288L, 68021);
      if ((this.jRt < 0) || (this.jRt > this.gQB)) {
        this.jRt = (this.gQB - 16);
      }
      if ((!bg.nm(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this))) && (com.tencent.mm.y.q.fp(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this))))
      {
        at.AR();
        setCursor(com.tencent.mm.y.c.yM().br(this.iGc, this.gQB - this.jRt));
        GMTrace.o(9129624076288L, 68021);
        return;
      }
      if (!com.tencent.mm.y.q.fp(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this)))
      {
        at.AR();
        setCursor(com.tencent.mm.y.c.yM().B(this.iGc, this.jRs, this.gQB - this.jRt));
      }
      GMTrace.o(9129624076288L, 68021);
    }
    
    protected final void QG()
    {
      GMTrace.i(9129758294016L, 68022);
      QF();
      GMTrace.o(9129758294016L, 68022);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9129892511744L, 68023);
      View localView = paramView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(this.context).inflate(R.i.cBr, null, false);
        paramView = new SelectMemberChattingRecordUI.b();
        paramView.hqG = ((ImageView)localView.findViewById(R.h.bfq));
        paramView.jpV = ((TextView)localView.findViewById(R.h.bQX));
        paramView.jRv = ((TextView)localView.findViewById(R.h.bOG));
        paramView.jRw = ((TextView)localView.findViewById(R.h.cjq));
        localView.setTag(paramView);
      }
      au localau = (au)getItem(paramInt);
      SelectMemberChattingRecordUI.b localb = (SelectMemberChattingRecordUI.b)localView.getTag();
      a.b.a(localb.hqG, this.jRs);
      paramView = this.jRs;
      at.AR();
      Object localObject = com.tencent.mm.y.c.yK().TE(paramView);
      if (!bg.nm(((af)localObject).field_conRemark)) {}
      for (paramViewGroup = ((af)localObject).field_conRemark;; paramViewGroup = SelectMemberChattingRecordUI.a(this.jRu, ((af)localObject).field_username))
      {
        paramView = paramViewGroup;
        if (bg.nm(paramViewGroup)) {
          paramView = ((x)localObject).vj();
        }
        paramViewGroup = paramView;
        if (!a.eE(((af)localObject).field_type))
        {
          at.AR();
          localObject = com.tencent.mm.y.c.yL().CC(((af)localObject).field_username);
          paramViewGroup = paramView;
          if (localObject != null)
          {
            paramViewGroup = paramView;
            if (!bg.nm(((bb)localObject).field_conRemark)) {
              paramViewGroup = ((bb)localObject).field_conRemark;
            }
          }
        }
        a(paramViewGroup, localb.jpV);
        paramView = this.jRs;
        a(SelectMemberChattingRecordUI.a(ab.getContext(), localau.field_type, localau.field_content, paramView, localau.field_isSend).trim(), localb.jRv);
        a(com.tencent.mm.pluginsdk.i.n.c(SelectMemberChattingRecordUI.this, localau.field_createTime, true), localb.jRw);
        GMTrace.o(9129892511744L, 68023);
        return localView;
      }
    }
  }
  
  private static final class b
  {
    public ImageView hqG;
    public TextView jRv;
    public TextView jRw;
    public TextView jpV;
    
    public b()
    {
      GMTrace.i(9130563600384L, 68028);
      GMTrace.o(9130563600384L, 68028);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SelectMemberChattingRecordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
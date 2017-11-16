package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.k;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.q;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BizChatAtSomeoneUI
  extends MMActivity
{
  private static boolean woA;
  private String eDs;
  private String jQJ;
  private String jQK;
  private p jQL;
  private ListView juD;
  private long juT;
  private String mTitle;
  private a woy;
  private com.tencent.mm.af.a.c woz;
  
  static
  {
    GMTrace.i(14474174005248L, 107841);
    woA = false;
    GMTrace.o(14474174005248L, 107841);
  }
  
  public BizChatAtSomeoneUI()
  {
    GMTrace.i(2982854787072L, 22224);
    GMTrace.o(2982854787072L, 22224);
  }
  
  protected static String a(com.tencent.mm.af.a.c paramc, String paramString)
  {
    GMTrace.i(2983660093440L, 22230);
    if (paramc == null)
    {
      GMTrace.o(2983660093440L, 22230);
      return null;
    }
    paramc = paramc.fs(paramString);
    GMTrace.o(2983660093440L, 22230);
    return paramc;
  }
  
  protected final void MP()
  {
    GMTrace.i(2983123222528L, 22226);
    sq(this.mTitle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2967553966080L, 22110);
        BizChatAtSomeoneUI.this.setResult(0);
        BizChatAtSomeoneUI.this.finish();
        GMTrace.o(2967553966080L, 22110);
        return true;
      }
    });
    this.jQL = new p(true, true);
    this.jQL.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(2996276559872L, 22324);
        GMTrace.o(2996276559872L, 22324);
      }
      
      public final void QB()
      {
        GMTrace.i(16851841056768L, 125556);
        GMTrace.o(16851841056768L, 125556);
      }
      
      public final void Qy()
      {
        GMTrace.i(2996008124416L, 22322);
        GMTrace.o(2996008124416L, 22322);
      }
      
      public final void Qz()
      {
        GMTrace.i(2996142342144L, 22323);
        GMTrace.o(2996142342144L, 22323);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(2995873906688L, 22321);
        GMTrace.o(2995873906688L, 22321);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(2995739688960L, 22320);
        BizChatAtSomeoneUI.a locala = BizChatAtSomeoneUI.a(BizChatAtSomeoneUI.this);
        locala.jQT = paramAnonymousString;
        locala.a(null, null);
        GMTrace.o(2995739688960L, 22320);
      }
    };
    a(this.jQL);
    this.juD = ((ListView)findViewById(R.h.bmj));
    j localj = new j();
    com.tencent.mm.af.a.c localc = this.woz;
    String[] arrayOfString = null;
    if (!t.nm(this.jQK))
    {
      arrayOfString = this.jQK.split(";");
      w.d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", new Object[] { Arrays.toString(arrayOfString) });
    }
    Object localObject = new LinkedList();
    if (!t.nm(this.jQJ)) {
      localObject = t.g(this.jQJ.split(";"));
    }
    this.woy = new a(this, localj, localc, arrayOfString, (List)localObject);
    this.juD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(3011711598592L, 22439);
        paramAnonymousAdapterView = new Intent();
        if ((paramAnonymousInt == 0) && (BizChatAtSomeoneUI.ey()))
        {
          paramAnonymousAdapterView.putExtra("Select_Conv_User", BizChatAtSomeoneUI.this.getString(R.l.cVd, new Object[] { "" }));
          paramAnonymousAdapterView.putExtra("select_raw_user_name", "notify@all");
        }
        for (;;)
        {
          BizChatAtSomeoneUI.this.setResult(-1, paramAnonymousAdapterView);
          BizChatAtSomeoneUI.this.finish();
          GMTrace.o(3011711598592L, 22439);
          return;
          paramAnonymousView = (j)BizChatAtSomeoneUI.a(BizChatAtSomeoneUI.this).getItem(paramAnonymousInt);
          String str = BizChatAtSomeoneUI.a(BizChatAtSomeoneUI.b(BizChatAtSomeoneUI.this), paramAnonymousView.field_userId);
          paramAnonymousAdapterView.putExtra("select_raw_user_name", paramAnonymousView.field_userId);
          paramAnonymousAdapterView.putExtra("Select_Conv_User", str);
        }
      }
    });
    this.juD.setAdapter(this.woy);
    this.juD.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2994531729408L, 22311);
        GMTrace.o(2994531729408L, 22311);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2994397511680L, 22310);
        n.Jd().bi(paramAnonymousInt);
        GMTrace.o(2994397511680L, 22310);
      }
    });
    GMTrace.o(2983123222528L, 22226);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2983525875712L, 22229);
    int i = R.i.cpu;
    GMTrace.o(2983525875712L, 22229);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2982989004800L, 22225);
    super.onCreate(paramBundle);
    this.jQJ = getIntent().getStringExtra("Block_list");
    this.jQK = getIntent().getStringExtra("Chatroom_member_list");
    this.eDs = getIntent().getStringExtra("Chat_User");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    this.juT = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.woz = x.FI().t(this.juT);
    if (this.woz == null)
    {
      w.w("MicroMsg.AtSomeoneUI", "bizChatInfo is null");
      finish();
      GMTrace.o(2982989004800L, 22225);
      return;
    }
    if ((this.woz != null) && (this.woz.field_ownerUserId.equals(q.zE()))) {
      woA = true;
    }
    MP();
    GMTrace.o(2982989004800L, 22225);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2983391657984L, 22228);
    this.woy.aJe();
    super.onDestroy();
    GMTrace.o(2983391657984L, 22228);
  }
  
  protected void onPause()
  {
    GMTrace.i(2983257440256L, 22227);
    super.onPause();
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(2983257440256L, 22227);
  }
  
  private static final class a
    extends o<j>
  {
    private List<String> iVA;
    private com.tencent.mm.ao.a.a.c jQF;
    String jQT;
    private String[] woC;
    private Bitmap woD;
    private com.tencent.mm.af.a.c woz;
    
    public a(Context paramContext, j paramj, com.tencent.mm.af.a.c paramc, String[] paramArrayOfString, List<String> paramList)
    {
      super(paramj);
      GMTrace.i(2994665947136L, 22312);
      this.jQF = null;
      this.woz = paramc;
      this.woC = paramArrayOfString;
      this.iVA = paramList;
      paramj = new c.a();
      paramj.gKF = com.tencent.mm.af.a.e.jm(this.woz.field_brandUserName);
      paramj.gKC = true;
      paramj.gKY = true;
      paramj.gKR = R.k.aVS;
      this.jQF = paramj.Jn();
      this.woD = com.tencent.mm.sdk.platformtools.d.t(paramContext.getResources().getDrawable(R.k.cJC));
      GMTrace.o(2994665947136L, 22312);
    }
    
    public final void QF()
    {
      GMTrace.i(2994934382592L, 22314);
      aJe();
      k localk = x.FK();
      Object localObject2 = this.woC;
      Object localObject1 = this.jQT;
      List localList = this.iVA;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("select *  from BizChatUserInfo where ");
      localObject2 = localStringBuilder.append(k.a((String[])localObject2, localList));
      if ((localObject1 == null) || (((String)localObject1).equals(""))) {}
      for (localObject1 = "";; localObject1 = " and (" + "userName like '%" + (String)localObject1 + "%' )")
      {
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = localStringBuilder.append(" order by ");
        localObject2 = new StringBuffer();
        ((StringBuffer)localObject2).append(" case when length(BizChatUserInfo.userNamePY) > 0 then upper(").append("BizChatUserInfo.userNamePY) ");
        ((StringBuffer)localObject2).append(" else upper(BizChatUserInfo.userName) end asc, ");
        ((StringBuffer)localObject2).append(" upper(BizChatUserInfo.userNamePY) asc, ");
        ((StringBuffer)localObject2).append(" upper(BizChatUserInfo.userName) asc ");
        ((StringBuilder)localObject1).append(((StringBuffer)localObject2).toString());
        setCursor(localk.fTZ.rawQuery(localStringBuilder.toString(), null));
        super.notifyDataSetChanged();
        GMTrace.o(2994934382592L, 22314);
        return;
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(2995068600320L, 22315);
      QF();
      GMTrace.o(2995068600320L, 22315);
    }
    
    protected final int aGD()
    {
      GMTrace.i(14474308222976L, 107842);
      if (BizChatAtSomeoneUI.ey())
      {
        GMTrace.o(14474308222976L, 107842);
        return 1;
      }
      GMTrace.o(14474308222976L, 107842);
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2994800164864L, 22313);
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cpt, null);
        paramViewGroup = new BizChatAtSomeoneUI.b();
        paramViewGroup.jRj = ((MaskLayout)paramView.findViewById(R.h.beU));
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.beV));
        paramView.setTag(paramViewGroup);
      }
      while ((paramInt == 0) && (BizChatAtSomeoneUI.ey()))
      {
        paramViewGroup.woE.setImageBitmap(this.woD);
        paramViewGroup.jtr.setText(this.context.getResources().getString(R.l.cVd, new Object[] { "@" }));
        GMTrace.o(2994800164864L, 22313);
        return paramView;
        paramViewGroup = (BizChatAtSomeoneUI.b)paramView.getTag();
      }
      if (BizChatAtSomeoneUI.ey()) {}
      for (int i = 1;; i = 0)
      {
        Object localObject = (j)getItem(paramInt - i);
        paramViewGroup.jtr.setTextColor(com.tencent.mm.br.a.U(this.context, R.e.aOq));
        ImageView localImageView = (ImageView)paramViewGroup.jRj.view;
        n.Jd().a(((j)localObject).field_headImageUrl, localImageView, this.jQF);
        paramViewGroup.jRj.caA();
        localObject = BizChatAtSomeoneUI.a(this.woz, ((j)localObject).field_userId);
        paramViewGroup.jtr.setText(h.b(this.context, (CharSequence)localObject, paramViewGroup.jtr.getTextSize()));
        GMTrace.o(2994800164864L, 22313);
        return paramView;
      }
    }
    
    public final boolean oR(int paramInt)
    {
      GMTrace.i(14474442440704L, 107843);
      GMTrace.o(14474442440704L, 107843);
      return false;
    }
  }
  
  private static final class b
  {
    public MaskLayout jRj;
    public TextView jtr;
    public ImageView woE;
    
    public b()
    {
      GMTrace.i(2998289825792L, 22339);
      GMTrace.o(2998289825792L, 22339);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatAtSomeoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
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
import com.tencent.mm.af.m;
import com.tencent.mm.br.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AtSomeoneUI
  extends MMActivity
{
  private static boolean woA;
  private String eDs;
  private com.tencent.mm.storage.q jNF;
  private String jQJ;
  private String jQK;
  private p jQL;
  private ListView juD;
  private String mTitle;
  private a wsX;
  
  static
  {
    GMTrace.i(14470550126592L, 107814);
    woA = false;
    GMTrace.o(14470550126592L, 107814);
  }
  
  public AtSomeoneUI()
  {
    GMTrace.i(2309216010240L, 17205);
    GMTrace.o(2309216010240L, 17205);
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(2310021316608L, 17211);
    if (paramq == null)
    {
      GMTrace.o(2310021316608L, 17211);
      return null;
    }
    paramq = paramq.fs(paramString);
    GMTrace.o(2310021316608L, 17211);
    return paramq;
  }
  
  protected final void MP()
  {
    boolean bool = true;
    GMTrace.i(2309484445696L, 17207);
    sq(this.mTitle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2154462969856L, 16052);
        AtSomeoneUI.this.setResult(0);
        AtSomeoneUI.this.finish();
        GMTrace.o(2154462969856L, 16052);
        return true;
      }
    });
    this.jQL = new p(true, true);
    this.jQL.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(2126814117888L, 15846);
        GMTrace.o(2126814117888L, 15846);
      }
      
      public final void QB()
      {
        GMTrace.i(16775202734080L, 124985);
        GMTrace.o(16775202734080L, 124985);
      }
      
      public final void Qy()
      {
        GMTrace.i(2126545682432L, 15844);
        GMTrace.o(2126545682432L, 15844);
      }
      
      public final void Qz()
      {
        GMTrace.i(2126679900160L, 15845);
        GMTrace.o(2126679900160L, 15845);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(2126411464704L, 15843);
        GMTrace.o(2126411464704L, 15843);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(2126277246976L, 15842);
        AtSomeoneUI.a locala = AtSomeoneUI.a(AtSomeoneUI.this);
        locala.jQT = paramAnonymousString;
        locala.a(null, null);
        GMTrace.o(2126277246976L, 15842);
      }
    };
    a(this.jQL);
    this.juD = ((ListView)findViewById(R.h.bmj));
    x localx = new x();
    com.tencent.mm.storage.q localq = this.jNF;
    Object localObject1 = null;
    if (!t.nm(this.jQK))
    {
      localObject1 = this.jQK.split(",");
      w.d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", new Object[] { Arrays.toString((Object[])localObject1) });
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = localObject1;
      if (this.jNF != null)
      {
        w.w("MicroMsg.AtSomeoneUI", "[getChatroomMember] chatroomMemberList is null!");
        localObject2 = t.c(this.jNF.FT(), ",").split(",");
      }
    }
    if (localObject2 == null) {
      if (this.jNF != null) {
        break label323;
      }
    }
    for (;;)
    {
      w.e("MicroMsg.AtSomeoneUI", "WTF! member is null? %s", new Object[] { Boolean.valueOf(bool) });
      localObject1 = new LinkedList();
      if (!t.nm(this.jQJ)) {
        localObject1 = t.g(this.jQJ.split(","));
      }
      at.AR();
      ay localay = c.yS().CB("@t.qq.com");
      if (localay != null) {
        ((List)localObject1).add(localay.name);
      }
      this.wsX = new a(this, localx, localq, (String[])localObject2, (List)localObject1);
      this.juD.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          int i = 1;
          GMTrace.i(2240228098048L, 16691);
          Intent localIntent = new Intent();
          if ((paramAnonymousInt == 0) && (AtSomeoneUI.ey()))
          {
            localIntent.putExtra("Select_Conv_User", AtSomeoneUI.this.getString(R.l.cVd, new Object[] { "" }));
            localIntent.putExtra("select_raw_user_name", "notify@all");
            AtSomeoneUI.this.setResult(-1, localIntent);
            AtSomeoneUI.this.finish();
            GMTrace.o(2240228098048L, 16691);
            return;
          }
          paramAnonymousAdapterView = AtSomeoneUI.a(AtSomeoneUI.this);
          if (AtSomeoneUI.ey()) {}
          for (;;)
          {
            x localx = (x)paramAnonymousAdapterView.getItem(paramAnonymousInt - i);
            paramAnonymousView = AtSomeoneUI.a(AtSomeoneUI.b(AtSomeoneUI.this), localx.field_username);
            paramAnonymousAdapterView = paramAnonymousView;
            if (t.nm(paramAnonymousView)) {
              paramAnonymousAdapterView = localx.vj();
            }
            localIntent.putExtra("select_raw_user_name", localx.field_username);
            localIntent.putExtra("Select_Conv_User", paramAnonymousAdapterView);
            break;
            i = 0;
          }
        }
      });
      this.juD.setAdapter(this.wsX);
      GMTrace.o(2309484445696L, 17207);
      return;
      label323:
      bool = false;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2309887098880L, 17210);
    int i = R.i.cpu;
    GMTrace.o(2309887098880L, 17210);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2309350227968L, 17206);
    super.onCreate(paramBundle);
    this.jQJ = getIntent().getStringExtra("Block_list");
    this.jQK = getIntent().getStringExtra("Chatroom_member_list");
    this.eDs = getIntent().getStringExtra("Chat_User");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    at.AR();
    this.jNF = c.yT().gC(this.eDs);
    if ((this.jNF != null) && (this.jNF.field_roomowner.equals(com.tencent.mm.y.q.zE()))) {
      woA = false;
    }
    MP();
    GMTrace.o(2309350227968L, 17206);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2309752881152L, 17209);
    this.wsX.aJe();
    super.onDestroy();
    GMTrace.o(2309752881152L, 17209);
  }
  
  protected void onPause()
  {
    GMTrace.i(2309618663424L, 17208);
    super.onPause();
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(2309618663424L, 17208);
  }
  
  private static final class a
    extends o<x>
  {
    private List<String> iVA;
    private com.tencent.mm.storage.q jNF;
    String jQT;
    private String[] woC;
    private Bitmap woD;
    
    public a(Context paramContext, x paramx, com.tencent.mm.storage.q paramq, String[] paramArrayOfString, List<String> paramList)
    {
      super(paramx);
      GMTrace.i(2277003755520L, 16965);
      this.jNF = paramq;
      this.woC = paramArrayOfString;
      this.iVA = paramList;
      this.woD = d.t(paramContext.getResources().getDrawable(R.k.cJC));
      GMTrace.o(2277003755520L, 16965);
    }
    
    public final void QF()
    {
      GMTrace.i(2277272190976L, 16967);
      at.AR();
      ar localar = c.yK();
      String[] arrayOfString1 = this.woC;
      String str1 = this.jQT;
      String str2 = this.jQT;
      Object localObject;
      if ((this.jNF == null) || (str2 == null) || (this.woC == null))
      {
        localObject = null;
        setCursor(localar.a(arrayOfString1, "@all.chatroom", str1, (List)localObject, this.iVA));
        super.notifyDataSetChanged();
        GMTrace.o(2277272190976L, 16967);
        return;
      }
      ArrayList localArrayList = new ArrayList();
      String[] arrayOfString2 = this.woC;
      int j = arrayOfString2.length;
      int i = 0;
      for (;;)
      {
        localObject = localArrayList;
        if (i >= j) {
          break;
        }
        localObject = arrayOfString2[i];
        String str3 = this.jNF.fs((String)localObject);
        if ((str3 != null) && (str3.contains(str2))) {
          localArrayList.add(localObject);
        }
        i += 1;
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(2277406408704L, 16968);
      aJe();
      QF();
      GMTrace.o(2277406408704L, 16968);
    }
    
    protected final int aGD()
    {
      GMTrace.i(14469342167040L, 107805);
      if (AtSomeoneUI.ey())
      {
        GMTrace.o(14469342167040L, 107805);
        return 1;
      }
      GMTrace.o(14469342167040L, 107805);
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2277137973248L, 16966);
      AtSomeoneUI.b localb;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(this.context, R.i.cpt, null);
        localb = new AtSomeoneUI.b();
        localb.jRj = ((MaskLayout)paramViewGroup.findViewById(R.h.beU));
        localb.jtr = ((TextView)paramViewGroup.findViewById(R.h.beV));
        localb.woE = ((ImageView)paramViewGroup.findViewById(R.h.content));
        paramViewGroup.setTag(localb);
      }
      while ((paramInt == 0) && (AtSomeoneUI.ey()))
      {
        localb.woE.setImageBitmap(this.woD);
        localb.jtr.setText(this.context.getResources().getString(R.l.cVd, new Object[] { "@" }));
        GMTrace.o(2277137973248L, 16966);
        return paramViewGroup;
        localb = (AtSomeoneUI.b)paramView.getTag();
        paramViewGroup = paramView;
      }
      int i;
      x localx;
      Object localObject;
      if (AtSomeoneUI.ey())
      {
        i = 1;
        localx = (x)getItem(paramInt - i);
        paramView = localb.jtr;
        localObject = this.context;
        if (s.gm(localx.field_username)) {
          break label365;
        }
        paramInt = R.e.aOq;
        label211:
        paramView.setTextColor(a.U((Context)localObject, paramInt));
        a.b.a((ImageView)localb.jRj.view, localx.field_username);
        if (localx.field_verifyFlag == 0) {
          break label394;
        }
        if (ak.a.gmZ == null) {
          break label383;
        }
        paramView = ak.a.gmZ.fs(localx.field_verifyFlag);
        if (paramView == null) {
          break label372;
        }
        paramView = m.iX(paramView);
        localb.jRj.d(paramView, MaskLayout.a.wgw);
        label289:
        if (t.nm(localx.field_conRemark)) {
          break label405;
        }
      }
      label365:
      label372:
      label383:
      label394:
      label405:
      for (paramView = localx.field_conRemark;; paramView = AtSomeoneUI.a(this.jNF, localx.field_username))
      {
        localObject = paramView;
        if (t.nm(paramView)) {
          localObject = localx.vj();
        }
        localb.jtr.setText(h.b(this.context, (CharSequence)localObject, localb.jtr.getTextSize()));
        GMTrace.o(2277137973248L, 16966);
        return paramViewGroup;
        i = 0;
        break;
        paramInt = R.e.aOr;
        break label211;
        localb.jRj.caA();
        break label289;
        localb.jRj.caA();
        break label289;
        localb.jRj.caA();
        break label289;
      }
    }
    
    public final boolean oR(int paramInt)
    {
      GMTrace.i(14469476384768L, 107806);
      GMTrace.o(14469476384768L, 107806);
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
      GMTrace.i(2267071643648L, 16891);
      GMTrace.o(2267071643648L, 16891);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\AtSomeoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
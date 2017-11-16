package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.search.ui.FTSTalkerUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public class f
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public i hWl;
  public List<String> hWm;
  public CharSequence hqB;
  public CharSequence hqC;
  public int oEo;
  private b oEp;
  a oEq;
  public String username;
  
  public f(int paramInt)
  {
    super(6, paramInt);
    GMTrace.i(11849948987392L, 88289);
    this.oEp = new b();
    this.oEq = new a();
    GMTrace.o(11849948987392L, 88289);
  }
  
  public com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16471602233344L, 122723);
    b localb = this.oEp;
    GMTrace.o(16471602233344L, 122723);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18366219681792L, 136839);
    a locala = this.oEq;
    GMTrace.o(18366219681792L, 136839);
    return locala;
  }
  
  public final int Vx()
  {
    GMTrace.i(11850351640576L, 88292);
    int i = this.hWl.lxn;
    GMTrace.o(11850351640576L, 88292);
    return i;
  }
  
  public void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16471468015616L, 122722);
    parama = (a)parama;
    this.username = this.hWl.lwH;
    this.hqB = h.b(paramContext, r.fs(this.username), parama.jpV.getTextSize());
    if ((this.hWl.userData instanceof Integer)) {
      this.oEo = ((Integer)this.hWl.userData).intValue();
    }
    if (this.oEo < 2)
    {
      String str = "";
      parama = "";
      at.AR();
      paramVarArgs = com.tencent.mm.y.c.yM().cM(this.hWl.lxe);
      switch (this.hWl.gRk)
      {
      default: 
        paramVarArgs = str;
      }
      for (;;)
      {
        this.hqC = h.c(paramContext, parama.replace('\n', ' '), d.b.lzv);
        if (bg.L(paramVarArgs)) {
          break;
        }
        float f1 = com.tencent.mm.plugin.fts.d.f.a.lzA;
        float f2 = d.b.lzw.measureText(paramVarArgs.toString());
        this.hqC = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.hqC, this.eQb, this.hWm, f1 - f2, d.b.lzw)).lAJ;
        this.hqC = TextUtils.concat(new CharSequence[] { paramVarArgs, this.hqC });
        GMTrace.o(16471468015616L, 122722);
        return;
        parama = paramVarArgs.field_content;
        Object localObject = parama;
        if (parama == null) {
          if (this.hWl.content != null) {
            break label327;
          }
        }
        label327:
        for (localObject = "";; localObject = this.hWl.content)
        {
          parama = (a.a)localObject;
          paramVarArgs = str;
          if (!s.eb(this.username)) {
            break;
          }
          parama = bc.gQ((String)localObject);
          paramVarArgs = str;
          break;
        }
        paramVarArgs = com.tencent.mm.x.f.a.eS(paramVarArgs.field_content);
        if (paramVarArgs != null) {
          parama = paramVarArgs.title;
        }
        paramVarArgs = paramContext.getString(R.l.dyy);
        continue;
        paramVarArgs = com.tencent.mm.x.f.a.eS(paramVarArgs.field_content);
        if (paramVarArgs != null) {
          parama = paramVarArgs.title;
        }
        paramVarArgs = paramContext.getString(R.l.dyz);
        continue;
        localObject = com.tencent.mm.x.f.a.eS(paramVarArgs.field_content);
        paramVarArgs = str;
        if (localObject != null)
        {
          paramVarArgs = ((com.tencent.mm.x.f.a)localObject).title + ": ";
          parama = ((com.tencent.mm.x.f.a)localObject).description;
          continue;
          localObject = com.tencent.mm.x.f.a.eS(paramVarArgs.field_content);
          paramVarArgs = str;
          if (localObject != null)
          {
            parama = bg.aq(((com.tencent.mm.x.f.a)localObject).title, "") + ": " + bg.aq(((com.tencent.mm.x.f.a)localObject).description, "");
            paramVarArgs = str;
            continue;
            parama = com.tencent.mm.x.f.a.eS(paramVarArgs.field_content);
            if (paramVarArgs.field_isSend == 1)
            {
              parama = bg.aq(parama.gjY, "") + ": " + bg.aq(parama.gjV, "");
              paramVarArgs = str;
            }
            else
            {
              parama = bg.aq(parama.gjY, "") + ": " + bg.aq(parama.gjU, "");
              paramVarArgs = str;
            }
          }
        }
      }
      this.hqC = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.hqC, this.eQb, this.hWm, com.tencent.mm.plugin.fts.d.f.a.lzA, d.b.lzw)).lAJ;
      GMTrace.o(16471468015616L, 122722);
      return;
    }
    this.hqC = paramContext.getResources().getString(R.l.dWC, new Object[] { Integer.valueOf(this.oEo) });
    GMTrace.o(16471468015616L, 122722);
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView jRv;
    public TextView jpV;
    
    public a()
    {
      super();
      GMTrace.i(11853035995136L, 88312);
      GMTrace.o(11853035995136L, 88312);
    }
  }
  
  public class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11847935721472L, 88274);
      GMTrace.o(11847935721472L, 88274);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11848069939200L, 88275);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxV, paramViewGroup, false);
      paramViewGroup = (f.a)f.this.oEq;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.jpV = ((TextView)paramContext.findViewById(R.h.bQX));
      paramViewGroup.jRv = ((TextView)paramContext.findViewById(R.h.bOG));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11848069939200L, 88275);
      return paramContext;
    }
    
    public void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472944410624L, 122733);
      paramContext = (f)paramVarArgs;
      parama = (f.a)parama;
      ck(parama.hqF);
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, paramContext.username);
      e.a(paramContext.hqB, parama.jpV);
      e.a(paramContext.hqC, parama.jRv);
      GMTrace.o(16472944410624L, 122733);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      GMTrace.i(16473078628352L, 122734);
      f localf = (f)paramVarArgs;
      if (f.this.oEo < 2) {
        if (com.tencent.mm.af.f.iP(localf.username))
        {
          paramVarArgs = new Intent().putExtra("Contact_User", localf.username);
          com.tencent.mm.plugin.search.a.hnH.d(paramVarArgs, paramContext);
        }
      }
      for (;;)
      {
        GMTrace.o(16473078628352L, 122734);
        return true;
        if (com.tencent.mm.af.f.dL(localf.username))
        {
          paramVarArgs = new Intent();
          paramVarArgs.putExtra("Contact_User", localf.username);
          paramVarArgs.addFlags(67108864);
          paramVarArgs.putExtra("biz_chat_from_scene", 5);
          com.tencent.mm.bj.d.a(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
        }
        else
        {
          if (com.tencent.mm.af.f.iQ(localf.username))
          {
            paramVarArgs = com.tencent.mm.af.f.iK(localf.username);
            if (paramVarArgs == null) {}
            for (paramVarArgs = (com.tencent.mm.plugin.fts.d.a.a)localObject1;; paramVarArgs = paramVarArgs.EJ())
            {
              localObject1 = paramVarArgs;
              if (paramVarArgs == null) {
                localObject1 = "";
              }
              paramVarArgs = new Intent();
              paramVarArgs.putExtra("rawUrl", (String)localObject1);
              paramVarArgs.putExtra("useJs", true);
              paramVarArgs.putExtra("srcUsername", localf.username);
              paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
              paramVarArgs.addFlags(67108864);
              com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
              break;
            }
          }
          paramVarArgs = new ArrayList(localf.hWm);
          paramVarArgs = new Intent().putExtra("Chat_User", localf.username).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", localf.hWl.lxe).putExtra("highlight_keyword_list", paramVarArgs);
          com.tencent.mm.plugin.search.a.hnH.e(paramVarArgs, paramContext);
          continue;
          if (com.tencent.mm.af.f.dL(localf.username))
          {
            paramVarArgs = new Intent();
            paramVarArgs.putExtra("Contact_User", localf.username);
            paramVarArgs.addFlags(67108864);
            paramVarArgs.putExtra("biz_chat_from_scene", 5);
            com.tencent.mm.bj.d.a(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
          }
          else
          {
            if (com.tencent.mm.af.f.iQ(localf.username))
            {
              paramVarArgs = com.tencent.mm.af.f.iK(localf.username);
              if (paramVarArgs == null) {}
              for (paramVarArgs = (com.tencent.mm.plugin.fts.d.a.a)localObject2;; paramVarArgs = paramVarArgs.EJ())
              {
                localObject1 = paramVarArgs;
                if (paramVarArgs == null) {
                  localObject1 = "";
                }
                paramVarArgs = new Intent();
                paramVarArgs.putExtra("rawUrl", (String)localObject1);
                paramVarArgs.putExtra("useJs", true);
                paramVarArgs.putExtra("srcUsername", localf.username);
                paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                paramVarArgs.addFlags(67108864);
                com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
                break;
              }
            }
            paramContext.startActivity(new Intent(paramContext, FTSTalkerUI.class).putExtra("Search_Scene", f.this.lzo).putExtra("key_talker", localf.username).putExtra("key_query", localf.eQb).putExtra("key_count", localf.oEo));
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
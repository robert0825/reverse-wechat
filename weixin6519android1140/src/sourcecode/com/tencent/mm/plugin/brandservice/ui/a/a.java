package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public i hWl;
  public List<String> hWm;
  public x iBi;
  public String iconUrl;
  public CharSequence jvL;
  public CharSequence jvM;
  private b jvN;
  a jvO;
  public String username;
  
  public a(int paramInt)
  {
    super(4, paramInt);
    GMTrace.i(10879689031680L, 81060);
    this.jvN = new b();
    this.jvO = new a();
    GMTrace.o(10879689031680L, 81060);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16569983827968L, 123456);
    b localb = this.jvN;
    GMTrace.o(16569983827968L, 123456);
    return localb;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a.a Vv()
  {
    GMTrace.i(18049868496896L, 134482);
    a locala = this.jvO;
    GMTrace.o(18049868496896L, 134482);
    return locala;
  }
  
  public final int Vx()
  {
    GMTrace.i(10880091684864L, 81063);
    int i = this.hWl.lxn;
    GMTrace.o(10880091684864L, 81063);
    return i;
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16569849610240L, 123455);
    this.username = this.hWl.lwH;
    at.AR();
    this.iBi = c.yK().TE(this.username);
    paramVarArgs = com.tencent.mm.af.f.iK(this.username);
    String str;
    int k;
    boolean bool3;
    boolean bool4;
    boolean bool1;
    boolean bool2;
    boolean bool5;
    int j;
    label100:
    int i;
    if (paramVarArgs == null)
    {
      parama = "";
      this.iconUrl = parama;
      str = r.fs(this.username);
      k = 0;
      bool3 = false;
      bool4 = false;
      bool1 = false;
      bool2 = false;
      bool5 = false;
      if ((paramVarArgs != null) && (!paramVarArgs.EL())) {
        break label308;
      }
      j = 1;
      switch (this.hWl.gRk)
      {
      default: 
        i = 0;
        parama = null;
        paramVarArgs = null;
        bool3 = bool4;
        bool2 = bool5;
        label163:
        if (i != 0) {
          this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
        }
        break;
      }
    }
    for (this.jvL = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvL, this.eQb, this.hWm, bool3, bool2)).lAJ;; this.jvL = h.c(paramContext, str, com.tencent.mm.br.a.V(paramContext, R.f.aQF)))
    {
      if ((k != 0) && (j != 0))
      {
        this.jvM = h.c(paramContext, paramVarArgs, com.tencent.mm.br.a.V(paramContext, R.f.aQF));
        this.jvM = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.jvM, this.eQb, this.hWm, bool3, bool2)).lAJ;
        this.jvM = TextUtils.concat(new CharSequence[] { parama, this.jvM });
      }
      GMTrace.o(16569849610240L, 123455);
      return;
      parama = paramVarArgs.field_brandIconURL;
      break;
      label308:
      j = 0;
      break label100;
      bool1 = true;
      bool3 = true;
      bool2 = bool1;
      i = 1;
      parama = null;
      paramVarArgs = null;
      break label163;
      paramVarArgs = this.iBi.qQ();
      parama = paramVarArgs;
      if (bg.nm(paramVarArgs)) {
        parama = this.iBi.field_username;
      }
      paramVarArgs = paramContext.getString(R.l.dWm);
      i = 0;
      com.tencent.mm.plugin.fts.d.a.a.a locala = parama;
      k = 1;
      bool2 = bool5;
      bool3 = bool4;
      parama = paramVarArgs;
      paramVarArgs = locala;
      break label163;
    }
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    
    public a()
    {
      super();
      GMTrace.i(10881568079872L, 81074);
      GMTrace.o(10881568079872L, 81074);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(10877809983488L, 81046);
      GMTrace.o(10877809983488L, 81046);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(10877944201216L, 81047);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxF, paramViewGroup, false);
      int i = paramViewGroup.getPaddingLeft();
      int j = paramViewGroup.getPaddingRight();
      paramContext.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824), i + j, -1), View.MeasureSpec.makeMeasureSpec(-2, 1073741824));
      paramViewGroup = (a.a)a.this.jvO;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(10877944201216L, 81047);
      return paramContext;
    }
    
    public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16568775868416L, 123447);
      paramVarArgs = (a)paramVarArgs;
      parama = (a.a)parama;
      ck(parama.hqF);
      e.a(paramContext, parama.hqG, paramVarArgs.iconUrl, null, R.g.aUD);
      e.a(paramVarArgs.jvL, parama.hqH);
      e.a(paramVarArgs.jvM, parama.hqI);
      GMTrace.o(16568775868416L, 123447);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16568910086144L, 123448);
      a locala = (a)paramVarArgs;
      a(a.this.eQb, locala.hWl);
      if (com.tencent.mm.af.f.iP(locala.username))
      {
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("enterprise_biz_name", locala.username);
        paramVarArgs.putExtra("enterprise_biz_display_name", r.fs(locala.username));
        paramVarArgs.putExtra("enterprise_from_scene", 3);
        com.tencent.mm.bj.d.a(paramContext, ".ui.conversation.EnterpriseConversationUI", paramVarArgs);
      }
      for (;;)
      {
        g.kJ(locala.username);
        GMTrace.o(16568910086144L, 123448);
        return true;
        if (com.tencent.mm.af.f.dL(locala.username))
        {
          paramVarArgs = new Intent();
          paramVarArgs.putExtra("Contact_User", locala.username);
          paramVarArgs.addFlags(67108864);
          paramVarArgs.putExtra("biz_chat_from_scene", 5);
          com.tencent.mm.bj.d.a(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
        }
        else
        {
          if (com.tencent.mm.af.f.iQ(locala.username))
          {
            paramVarArgs = com.tencent.mm.af.f.iK(locala.username);
            if (paramVarArgs == null) {}
            for (paramVarArgs = null;; paramVarArgs = paramVarArgs.EJ())
            {
              Object localObject = paramVarArgs;
              if (paramVarArgs == null) {
                localObject = "";
              }
              paramVarArgs = new Intent();
              paramVarArgs.putExtra("rawUrl", (String)localObject);
              paramVarArgs.putExtra("useJs", true);
              paramVarArgs.putExtra("srcUsername", locala.username);
              paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
              paramVarArgs.addFlags(67108864);
              com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
              break;
            }
          }
          paramVarArgs = new Intent();
          paramVarArgs.putExtra("Chat_User", locala.username);
          paramVarArgs.putExtra("finish_direct", true);
          com.tencent.mm.bj.d.a(paramContext, ".ui.chatting.En_5b8fbb1e", paramVarArgs);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
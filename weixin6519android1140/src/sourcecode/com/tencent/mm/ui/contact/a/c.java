package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.List;
import java.util.regex.Pattern;

public final class c
  extends a
{
  private static final Pattern gRh;
  public i hWl;
  private List<String> hWm;
  public CharSequence hqB;
  public CharSequence hqC;
  public String[] lxa;
  public String username;
  public CharSequence wUM;
  private b wUN;
  a wUO;
  
  static
  {
    GMTrace.i(1774626799616L, 13222);
    gRh = Pattern.compile(";");
    GMTrace.o(1774626799616L, 13222);
  }
  
  public c(int paramInt)
  {
    super(3, paramInt);
    GMTrace.i(1773955710976L, 13217);
    this.wUN = new b();
    this.wUO = new a();
    GMTrace.o(1773955710976L, 13217);
  }
  
  public final a.b PV()
  {
    GMTrace.i(1774224146432L, 13219);
    b localb = this.wUN;
    GMTrace.o(1774224146432L, 13219);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(1774358364160L, 13220);
    a locala = this.wUO;
    GMTrace.o(1774358364160L, 13220);
    return locala;
  }
  
  public final boolean aCH()
  {
    GMTrace.i(1774492581888L, 13221);
    boolean bool = this.hWl.lxo;
    GMTrace.o(1774492581888L, 13221);
    return bool;
  }
  
  public final void bz(Context paramContext)
  {
    List localList = null;
    int k = 1;
    boolean bool1 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    GMTrace.i(1774089928704L, 13218);
    int i;
    if (this.hWl != null) {
      if ((this.lxa != null) && (this.lxa.length > 0))
      {
        this.hWm = bg.g(this.lxa);
        i = 1;
        j = i;
        if (this.iBi == null)
        {
          com.tencent.mm.kernel.h.xz();
          this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(this.hWl.lwH);
          j = i;
          if (this.iBi == null)
          {
            com.tencent.mm.kernel.h.xz();
            this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.hWl.lwH);
          }
        }
      }
    }
    for (int j = i;; j = 0)
    {
      if (this.iBi != null) {
        break label193;
      }
      w.i("MicroMsg.ChatroomDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
      GMTrace.o(1774089928704L, 13218);
      return;
      i = 0;
      break;
    }
    label193:
    this.username = this.iBi.field_username;
    i locali;
    Object localObject;
    Resources localResources;
    String str1;
    if (j != 0)
    {
      locali = this.hWl;
      localObject = this.iBi;
      String[] arrayOfString = this.lxa;
      localResources = paramContext.getResources();
      str1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).a((x)localObject, ((af)localObject).field_username);
      switch (locali.gRk)
      {
      default: 
        bool1 = false;
        i = 0;
        localObject = localList;
        localList = bg.g(arrayOfString);
        if (i != 0)
        {
          this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str1, com.tencent.mm.br.a.V(paramContext, a.c.aQo));
          this.hqB = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.hqB, this.eQb, localList, bool1, bool2)).lAJ;
          this.hqC = ((CharSequence)localObject);
          GMTrace.o(1774089928704L, 13218);
          return;
        }
        break;
      case 3: 
      case 7: 
        bool1 = true;
      case 2: 
      case 6: 
        label333:
        label388:
        bool3 = true;
        bool2 = bool1;
        bool1 = bool3;
      }
    }
    for (;;)
    {
      localResources.getString(a.h.dWi);
      localObject = localList;
      i = k;
      break label333;
      com.tencent.mm.kernel.h.xz();
      localObject = com.tencent.mm.kernel.h.xy().fYV.a("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new String[] { ((af)localObject).field_username }, 2);
      String str2;
      if (((Cursor)localObject).moveToFirst())
      {
        str2 = ((Cursor)localObject).getString(0);
        ((Cursor)localObject).close();
        if (str2 == null) {
          localObject = null;
        }
      }
      for (;;)
      {
        if ((localObject != null) && (localObject.length > 0)) {
          this.wUM = ("(" + localObject.length + ")");
        }
        if ((localObject == null) || (locali.lxl == null)) {
          break;
        }
        localObject = com.tencent.mm.plugin.fts.d.e.a(paramContext, locali.lxl, (String[])localObject, this.hWm, d.b.lzw, this.eQb);
        localObject = TextUtils.concat(new CharSequence[] { localResources.getString(a.h.dWg), localObject });
        bool1 = false;
        i = 0;
        break label333;
        localObject = gRh.split(str2);
        continue;
        ((Cursor)localObject).close();
        localObject = null;
      }
      this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str1, com.tencent.mm.br.a.V(paramContext, a.c.aQo));
      break label388;
      this.hqB = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).a(this.iBi, this.iBi.field_username);
      if (this.hWl != null) {
        this.wUM = ("(" + this.hWl.lxe + ")");
      }
      GMTrace.o(1774089928704L, 13218);
      return;
      bool1 = false;
      bool2 = bool3;
    }
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    public CheckBox hqJ;
    public TextView lAu;
    
    public a()
    {
      super();
      GMTrace.i(1771942445056L, 13202);
      GMTrace.o(1771942445056L, 13202);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1766171082752L, 13159);
      GMTrace.o(1766171082752L, 13159);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1766573735936L, 13162);
      if (c.this.hWl != null) {
        ((l)com.tencent.mm.kernel.h.j(l.class)).updateTopHitsRank(c.this.eQb, c.this.hWl, 1);
      }
      GMTrace.o(1766573735936L, 13162);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1766305300480L, 13160);
      if (com.tencent.mm.br.a.ed(paramContext)) {}
      for (paramViewGroup = LayoutInflater.from(paramContext).inflate(a.f.oFu, paramViewGroup, false);; paramViewGroup = LayoutInflater.from(paramContext).inflate(a.f.oFt, paramViewGroup, false))
      {
        c.a locala = (c.a)c.this.wUO;
        locala.hqG = ((ImageView)paramViewGroup.findViewById(a.e.bfq));
        locala.hqH = ((TextView)paramViewGroup.findViewById(a.e.chT));
        locala.hqH.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(paramContext, 200));
        locala.hqI = ((TextView)paramViewGroup.findViewById(a.e.bti));
        locala.lAu = ((TextView)paramViewGroup.findViewById(a.e.chy));
        locala.hqF = paramViewGroup.findViewById(a.e.cbB);
        locala.hqJ = ((CheckBox)paramViewGroup.findViewById(a.e.cbs));
        if (c.this.jug) {
          locala.hqF.setBackgroundResource(a.d.aVP);
        }
        paramViewGroup.setTag(locala);
        GMTrace.o(1766305300480L, 13160);
        return paramViewGroup;
      }
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1766439518208L, 13161);
      paramContext = (c.a)parama;
      parama = (c)parama1;
      if ((parama.username != null) && (parama.username.length() > 0))
      {
        com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.hqG, parama.username);
        com.tencent.mm.plugin.fts.d.e.a(parama.hqB, paramContext.hqH);
        com.tencent.mm.plugin.fts.d.e.a(parama.hqC, paramContext.hqI);
        com.tencent.mm.plugin.fts.d.e.a(parama.wUM, paramContext.lAu);
        if (!c.this.wSC) {
          break label165;
        }
        if (!paramBoolean1) {
          break label145;
        }
        paramContext.hqJ.setChecked(true);
        paramContext.hqJ.setEnabled(false);
      }
      for (;;)
      {
        paramContext.hqJ.setVisibility(0);
        GMTrace.o(1766439518208L, 13161);
        return;
        paramContext.hqG.setImageResource(a.d.aVS);
        break;
        label145:
        paramContext.hqJ.setChecked(paramBoolean2);
        paramContext.hqJ.setEnabled(true);
      }
      label165:
      paramContext.hqJ.setVisibility(8);
      GMTrace.o(1766439518208L, 13161);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
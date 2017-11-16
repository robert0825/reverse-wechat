package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.c;
import com.tencent.mm.az.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.brandservice.ui.base.b.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbc;
import com.tencent.mm.protocal.c.im;
import com.tencent.mm.protocal.c.io;
import com.tencent.mm.protocal.c.is;
import com.tencent.mm.protocal.c.op;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.brandservice.ui.base.a
{
  private static b jtk;
  protected String iconUrl;
  protected CharSequence jtl;
  protected CharSequence jtm;
  protected CharSequence jtn;
  protected boolean jto;
  protected boolean jtp;
  protected CharSequence nickName;
  protected String username;
  
  public a(Object paramObject)
  {
    super(5, paramObject);
    GMTrace.i(10853516574720L, 80865);
    GMTrace.o(10853516574720L, 80865);
  }
  
  public final void a(Context paramContext, com.tencent.mm.ui.base.sortview.a.a parama, Object... paramVarArgs)
  {
    Object localObject = null;
    GMTrace.i(20421764186112L, 152154);
    if (this.wln)
    {
      GMTrace.o(20421764186112L, 152154);
      return;
    }
    if ((paramContext == null) || (parama == null) || (this.data == null))
    {
      w.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
      GMTrace.o(20421764186112L, 152154);
      return;
    }
    if (!(parama instanceof a))
    {
      w.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
      GMTrace.o(20421764186112L, 152154);
      return;
    }
    if (!(this.data instanceof is))
    {
      w.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
      GMTrace.o(20421764186112L, 152154);
      return;
    }
    a locala = (a)parama;
    parama = (is)this.data;
    if ((parama.tXK == null) || (parama.tXK.tXs == null))
    {
      w.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
      GMTrace.o(20421764186112L, 152154);
      return;
    }
    bbc localbbc = parama.tXK.tXs;
    parama = parama.tXK.tXp;
    if ((paramVarArgs != null) && (paramVarArgs.length > 1) && ((paramVarArgs[1] instanceof List))) {
      this.hWm = ((List)paramVarArgs[1]);
    }
    this.username = localbbc.ufy.uNR;
    this.iconUrl = localbbc.ubW;
    if (parama == null) {
      parama = "";
    }
    for (;;)
    {
      this.jtm = parama;
      if (localbbc.uxT == null) {
        parama = null;
      }
      try
      {
        paramVarArgs = this.hWm;
        locala.jtr.getTextSize();
        this.nickName = com.tencent.mm.plugin.brandservice.a.a.b(paramContext, parama, paramVarArgs);
        paramVarArgs = localbbc.ufy.uNR;
        op localop = localbbc.uOw;
        if (localop != null)
        {
          parama = new com.tencent.mm.af.d();
          parama.field_username = paramVarArgs;
          com.tencent.mm.plugin.brandservice.a.a.a(parama, localop);
          paramVarArgs = (Object[])localObject;
          if (parama != null)
          {
            paramVarArgs = (Object[])localObject;
            if (parama.bq(false) != null) {
              paramVarArgs = parama.bq(false).Fa();
            }
          }
          if (paramVarArgs != null)
          {
            if ((parama.bq(false).Fc()) && (!bg.nm(paramVarArgs.gwE)))
            {
              bool = true;
              this.jtp = bool;
              if (localbbc.uAv == 0) {
                break label655;
              }
              bool = true;
              this.jto = bool;
            }
          }
          else
          {
            w.v("MicroMsg.BizContactDataItem", "verifyFlag : %d", new Object[] { Integer.valueOf(localbbc.uAv) });
            parama = localbbc.gCC;
            if ((this.hWm.size() <= 0) || (parama == null) || (!parama.toLowerCase().equals(((String)this.hWm.get(0)).toLowerCase()))) {}
          }
        }
      }
      catch (Exception parama)
      {
        for (;;)
        {
          try
          {
            paramVarArgs = this.hWm;
            locala.jtv.getTextSize();
            this.jtn = com.tencent.mm.plugin.brandservice.a.a.b(paramContext, parama, paramVarArgs);
            this.jtn = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(R.l.dWm), this.jtn });
            if ((this.jtn != null) && (this.jtn.length() != 0) && (this.jtm != null)) {
              if (this.jtm.length() != 0) {
                continue;
              }
            }
          }
          catch (Exception parama)
          {
            try
            {
              parama = localbbc.gCA;
              paramVarArgs = this.hWm;
              locala.jtt.getTextSize();
              this.jtl = com.tencent.mm.plugin.brandservice.a.a.b(paramContext, parama, paramVarArgs);
              w.d("MicroMsg.BizContactDataItem", "nickName : %s, followFriends : %s.", new Object[] { this.nickName, this.jtm });
              this.wln = true;
              GMTrace.o(20421764186112L, 152154);
              return;
              parama = parama.tXy;
              break;
              parama = localbbc.uxT.uNR;
              continue;
              parama = parama;
              this.nickName = "";
              continue;
              boolean bool = false;
              continue;
              label655:
              bool = false;
              continue;
              parama = parama;
              this.jtn = "";
            }
            catch (Exception paramContext)
            {
              this.jtl = "";
              continue;
            }
          }
          parama = null;
        }
      }
    }
  }
  
  public final com.tencent.mm.ui.base.sortview.a.b aig()
  {
    GMTrace.i(20421495750656L, 152152);
    if (jtk == null) {
      jtk = new b();
    }
    b localb = jtk;
    GMTrace.o(20421495750656L, 152152);
    return localb;
  }
  
  public final com.tencent.mm.ui.base.sortview.a.a aih()
  {
    GMTrace.i(20421629968384L, 152153);
    a locala = new a();
    GMTrace.o(20421629968384L, 152153);
    return locala;
  }
  
  public static final class a
    extends com.tencent.mm.plugin.brandservice.a.a.a
    implements com.tencent.mm.ui.base.sortview.a.a
  {
    public TextView jtq;
    public TextView jtr;
    public View jts;
    public TextView jtt;
    public TextView jtu;
    public TextView jtv;
    public View jtw;
    
    public a()
    {
      GMTrace.i(10891768627200L, 81150);
      GMTrace.o(10891768627200L, 81150);
    }
  }
  
  public static final class b
    extends com.tencent.mm.ui.base.sortview.a.b
  {
    public b()
    {
      GMTrace.i(10860630114304L, 80918);
      GMTrace.o(10860630114304L, 80918);
    }
    
    public final void a(Context paramContext, com.tencent.mm.ui.base.sortview.a.a parama, com.tencent.mm.ui.base.sortview.a paramVarArgs)
    {
      GMTrace.i(20420690444288L, 152146);
      if ((paramContext == null) || (parama == null) || (paramVarArgs == null) || (paramVarArgs.data == null))
      {
        w.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
        GMTrace.o(20420690444288L, 152146);
        return;
      }
      if (!(parama instanceof a.a))
      {
        w.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
        GMTrace.o(20420690444288L, 152146);
        return;
      }
      if (!(paramVarArgs instanceof a))
      {
        w.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
        GMTrace.o(20420690444288L, 152146);
        return;
      }
      paramContext = (a.a)parama;
      parama = (a)paramVarArgs;
      paramContext.username = parama.username;
      paramContext.iconUrl = parama.iconUrl;
      b.a.a(paramContext.hqG, parama.username, parama.iconUrl);
      paramVarArgs = paramContext.jts;
      int i;
      if (parama.jto)
      {
        i = 0;
        paramVarArgs.setVisibility(i);
        paramVarArgs = paramContext.jtw;
        if (!parama.jtp) {
          break label283;
        }
        i = 0;
        label166:
        paramVarArgs.setVisibility(i);
        com.tencent.mm.plugin.brandservice.a.a.b(paramContext.jtr, parama.nickName);
        boolean bool1 = com.tencent.mm.plugin.brandservice.a.a.b(paramContext.jtv, parama.jtn);
        boolean bool2 = com.tencent.mm.plugin.brandservice.a.a.b(paramContext.jtu, parama.jtm);
        if (com.tencent.mm.plugin.brandservice.a.a.b(paramContext.jtt, parama.jtl))
        {
          if ((bool1) || (bool2)) {
            break label290;
          }
          paramContext.jtt.setMaxLines(2);
        }
      }
      for (;;)
      {
        w.d("MicroMsg.BizContactDataItem", "fillingView , nickName : %s, followFriends : %s.", new Object[] { parama.nickName, parama.jtm });
        GMTrace.o(20420690444288L, 152146);
        return;
        i = 8;
        break;
        label283:
        i = 8;
        break label166;
        label290:
        paramContext.jtt.setMaxLines(1);
      }
    }
    
    public final void a(View paramView, com.tencent.mm.ui.base.sortview.a.a parama)
    {
      GMTrace.i(20420824662016L, 152147);
      if ((paramView != null) && (parama != null) && ((parama instanceof a.a)))
      {
        parama = (a.a)parama;
        parama.jtq = ((TextView)paramView.findViewById(R.h.brF));
        parama.jtw = paramView.findViewById(R.h.bhp);
        parama.hqG = ((ImageView)paramView.findViewById(R.h.bfl));
        parama.jtr = ((TextView)paramView.findViewById(R.h.bQW));
        parama.jts = paramView.findViewById(R.h.cjV);
        parama.jtu = ((TextView)paramView.findViewById(R.h.bAV));
        parama.jtt = ((TextView)paramView.findViewById(R.h.bHu));
        parama.jtv = ((TextView)paramView.findViewById(R.h.coK));
      }
      GMTrace.o(20420824662016L, 152147);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.ui.base.sortview.a parama, Object... paramVarArgs)
    {
      GMTrace.i(20420556226560L, 152145);
      if (!(parama instanceof a))
      {
        GMTrace.o(20420556226560L, 152145);
        return false;
      }
      a locala = (a)parama;
      if (!(parama.data instanceof is))
      {
        w.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BusinessResultItem.");
        GMTrace.o(20420556226560L, 152145);
        return false;
      }
      Object localObject4 = (is)parama.data;
      if ((((is)localObject4).tXK == null) || (((is)localObject4).tXK.tXs == null))
      {
        w.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
        GMTrace.o(20420556226560L, 152145);
        return false;
      }
      int j = 0;
      Object localObject1 = null;
      int i;
      Object localObject3;
      if (paramVarArgs != null) {
        if ((paramVarArgs.length > 0) && ((paramVarArgs[0] instanceof c)))
        {
          localObject1 = (c)paramVarArgs[0];
          i = j;
          if (paramVarArgs.length > 2)
          {
            i = j;
            if ((paramVarArgs[2] instanceof Integer)) {
              i = ((Integer)paramVarArgs[2]).intValue();
            }
          }
          if ((paramVarArgs.length > 3) && ((paramVarArgs[3] instanceof String)))
          {
            paramVarArgs = (String)paramVarArgs[3];
            localObject3 = localObject1;
            localObject1 = paramVarArgs;
            paramVarArgs = (Object[])localObject3;
          }
        }
      }
      for (;;)
      {
        Object localObject5 = ((is)localObject4).tXK.lPE;
        bbc localbbc = ((is)localObject4).tXK.tXs;
        if (localbbc.uxT != null)
        {
          localObject4 = localbbc.uxT.uNR;
          if (localbbc.ufy == null) {
            break label288;
          }
        }
        label288:
        for (localObject3 = localbbc.ufy.uNR;; localObject3 = null)
        {
          if (!bg.nm((String)localObject3)) {
            break label294;
          }
          w.e("MicroMsg.BizContactDataItem", "onItemClick but username is null");
          GMTrace.o(20420556226560L, 152145);
          return false;
          localObject4 = null;
          break;
        }
        label294:
        g.kJ((String)localObject3);
        if (!bg.nm((String)localObject5))
        {
          i = 8;
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", (String)localObject5);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("vertical_scroll", true);
          com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        }
        for (;;)
        {
          paramContext = locala.aiw();
          if ((paramContext != null) && (paramVarArgs != null)) {
            paramContext.a(paramVarArgs, parama, i, (String)localObject3, locala.aix(), locala.getPosition());
          }
          GMTrace.o(20420556226560L, 152145);
          return true;
          at.AR();
          x localx = com.tencent.mm.y.c.yK().TE((String)localObject3);
          localObject5 = new Intent();
          Bundle localBundle = new Bundle();
          localBundle.putString("Contact_Ext_Args_Search_Id", (String)localObject1);
          localBundle.putInt("Contact_Ext_Args_Index", locala.aix());
          localBundle.putString("Contact_Ext_Args_Query_String", "");
          localBundle.putInt("Contact_Scene", i);
          ((Intent)localObject5).putExtra("Contact_Ext_Args", localBundle);
          ((Intent)localObject5).putExtra("Contact_User", (String)localObject3);
          ((Intent)localObject5).putExtra("Contact_Scene", i);
          if (!com.tencent.mm.l.a.eE(localx.field_type))
          {
            ((Intent)localObject5).putExtra("Contact_Alias", localbbc.gCC);
            ((Intent)localObject5).putExtra("Contact_Nick", (String)localObject4);
            ((Intent)localObject5).putExtra("Contact_Signature", localbbc.gCA);
            ((Intent)localObject5).putExtra("Contact_RegionCode", RegionCodeDecoder.ai(localbbc.gCG, localbbc.gCy, localbbc.gCz));
            ((Intent)localObject5).putExtra("Contact_Sex", localbbc.gCx);
            ((Intent)localObject5).putExtra("Contact_VUser_Info", localbbc.uAw);
            ((Intent)localObject5).putExtra("Contact_VUser_Info_Flag", localbbc.uAv);
            ((Intent)localObject5).putExtra("Contact_KWeibo_flag", localbbc.uAz);
            ((Intent)localObject5).putExtra("Contact_KWeibo", localbbc.uAx);
            ((Intent)localObject5).putExtra("Contact_KWeiboNick", localbbc.uAy);
            if (localbbc.uOw == null) {}
          }
          try
          {
            ((Intent)localObject5).putExtra("Contact_customInfo", localbbc.uOw.toByteArray());
            com.tencent.mm.plugin.brandservice.a.hnH.d((Intent)localObject5, paramContext);
            i = 1;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.BizContactDataItem", localIOException, "", new Object[0]);
            }
          }
        }
        paramVarArgs = localIOException;
        Object localObject2 = "";
        continue;
        localObject2 = null;
        break;
        localObject3 = "";
        i = 0;
        paramVarArgs = (Object[])localObject2;
        localObject2 = localObject3;
      }
    }
    
    public final View b(Context paramContext, View paramView)
    {
      GMTrace.i(10860898549760L, 80920);
      View localView = paramView;
      if (paramView == null) {
        localView = View.inflate(paramContext, R.i.cFv, null);
      }
      GMTrace.o(10860898549760L, 80920);
      return localView;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
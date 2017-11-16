package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.sortview.a.b;
import com.tencent.mm.y.at;
import java.io.IOException;

public final class b
  extends com.tencent.mm.plugin.brandservice.ui.base.a
{
  private static a.b jtx;
  public CharSequence hqB;
  protected String iconUrl;
  protected CharSequence jtl;
  protected boolean jto;
  protected boolean jtp;
  protected String jty;
  protected String username;
  
  public b(Object paramObject, String paramString)
  {
    super(6, paramObject);
    GMTrace.i(10864656646144L, 80948);
    this.jty = paramString;
    GMTrace.o(10864656646144L, 80948);
  }
  
  public final void a(Context paramContext, com.tencent.mm.ui.base.sortview.a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(20418006089728L, 152126);
    if (this.wln)
    {
      GMTrace.o(20418006089728L, 152126);
      return;
    }
    if ((paramContext == null) || (parama == null) || (this.data == null))
    {
      w.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
      GMTrace.o(20418006089728L, 152126);
      return;
    }
    if (!(parama instanceof a))
    {
      w.e("MicroMsg.BizRecommDataItem", "The DataItem is not a instance of BizProductViewHolder.");
      GMTrace.o(20418006089728L, 152126);
      return;
    }
    if (!(this.data instanceof bbb))
    {
      w.e("MicroMsg.BizRecommDataItem", "The data is not a instance of SearchOrRecommendItem.");
      GMTrace.o(20418006089728L, 152126);
      return;
    }
    a locala = (a)parama;
    paramVarArgs = (bbb)this.data;
    if (paramVarArgs.uxT != null) {
      parama = paramVarArgs.uxT.toString();
    }
    try
    {
      for (;;)
      {
        this.hqB = h.b(paramContext, parama, locala.jpV.getTextSize());
        this.iconUrl = paramVarArgs.ubW;
        this.username = paramVarArgs.ufy.toString();
        GMTrace.o(20418006089728L, 152126);
        return;
        parama = "";
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        this.hqB = "";
      }
    }
  }
  
  public final a.b aig()
  {
    GMTrace.i(20417737654272L, 152124);
    if (jtx == null) {
      jtx = new a.b()
      {
        public final void a(Context paramAnonymousContext, com.tencent.mm.ui.base.sortview.a.a paramAnonymousa, com.tencent.mm.ui.base.sortview.a paramAnonymousVarArgs)
        {
          int j = 0;
          GMTrace.i(20419616702464L, 152138);
          if ((paramAnonymousContext == null) || (paramAnonymousa == null) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.data == null))
          {
            w.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            GMTrace.o(20419616702464L, 152138);
            return;
          }
          if (!(paramAnonymousa instanceof b.a))
          {
            w.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of BizRecommViewHolder.");
            GMTrace.o(20419616702464L, 152138);
            return;
          }
          if (!(paramAnonymousVarArgs.data instanceof bbb))
          {
            w.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of SearchOrRecommendItem.");
            GMTrace.o(20419616702464L, 152138);
            return;
          }
          paramAnonymousContext = (b.a)paramAnonymousa;
          paramAnonymousa = (b)paramAnonymousVarArgs;
          paramAnonymousContext.username = paramAnonymousa.username;
          paramAnonymousContext.iconUrl = paramAnonymousa.iconUrl;
          com.tencent.mm.plugin.brandservice.ui.base.b.a.a(paramAnonymousContext.hqG, paramAnonymousa.username, paramAnonymousa.iconUrl);
          paramAnonymousContext.jpV.setText(paramAnonymousa.hqB, TextView.BufferType.SPANNABLE);
          paramAnonymousVarArgs = paramAnonymousContext.jtw;
          if (paramAnonymousa.jtp)
          {
            i = 0;
            paramAnonymousVarArgs.setVisibility(i);
            paramAnonymousVarArgs = paramAnonymousContext.jts;
            if (!paramAnonymousa.jto) {
              break label235;
            }
          }
          label235:
          for (int i = j;; i = 8)
          {
            paramAnonymousVarArgs.setVisibility(i);
            paramAnonymousContext.jtt.setText(paramAnonymousa.jtl, TextView.BufferType.SPANNABLE);
            com.tencent.mm.plugin.brandservice.a.a.b(paramAnonymousContext.jtq, paramAnonymousa.jty);
            GMTrace.o(20419616702464L, 152138);
            return;
            i = 8;
            break;
          }
        }
        
        public final void a(View paramAnonymousView, com.tencent.mm.ui.base.sortview.a.a paramAnonymousa)
        {
          GMTrace.i(20419750920192L, 152139);
          if ((paramAnonymousView != null) && (paramAnonymousa != null) && ((paramAnonymousa instanceof b.a)))
          {
            paramAnonymousa = (b.a)paramAnonymousa;
            paramAnonymousa.hqG = ((ImageView)paramAnonymousView.findViewById(R.h.bfl));
            paramAnonymousa.jpV = ((TextView)paramAnonymousView.findViewById(R.h.bQW));
            paramAnonymousa.jtq = ((TextView)paramAnonymousView.findViewById(R.h.brF));
            paramAnonymousa.jtw = paramAnonymousView.findViewById(R.h.bhp);
            paramAnonymousa.jts = paramAnonymousView.findViewById(R.h.cjV);
            paramAnonymousa.jtt = ((TextView)paramAnonymousView.findViewById(R.h.bHu));
          }
          GMTrace.o(20419750920192L, 152139);
        }
        
        public final boolean a(Context paramAnonymousContext, com.tencent.mm.ui.base.sortview.a paramAnonymousa, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(20419482484736L, 152137);
          if (!(paramAnonymousa instanceof b))
          {
            GMTrace.o(20419482484736L, 152137);
            return false;
          }
          b localb = (b)paramAnonymousa;
          bbb localbbb = (bbb)paramAnonymousa.data;
          String str2;
          if (localbbb.uxT != null)
          {
            str2 = localbbb.uxT.uNR;
            if (localbbb.ufy == null) {
              break label107;
            }
          }
          label107:
          for (String str1 = localbbb.ufy.uNR;; str1 = null)
          {
            if (!bg.nm(str1)) {
              break label113;
            }
            w.e("MicroMsg.BizRecommDataItem", "onItemClick but username is null");
            GMTrace.o(20419482484736L, 152137);
            return false;
            str2 = null;
            break;
          }
          label113:
          at.AR();
          x localx = com.tencent.mm.y.c.yK().TE(str1);
          Intent localIntent = new Intent();
          if (com.tencent.mm.l.a.eE(localx.field_type))
          {
            localIntent.putExtra("Contact_User", str1);
            localIntent.putExtra("Contact_Scene", 55);
          }
          for (;;)
          {
            com.tencent.mm.plugin.brandservice.a.hnH.d(localIntent, paramAnonymousContext);
            str2 = null;
            paramAnonymousContext = str2;
            if (paramAnonymousVarArgs != null)
            {
              paramAnonymousContext = str2;
              if (paramAnonymousVarArgs.length > 0)
              {
                paramAnonymousContext = str2;
                if ((paramAnonymousVarArgs[0] instanceof c)) {
                  paramAnonymousContext = (c)paramAnonymousVarArgs[0];
                }
              }
            }
            paramAnonymousVarArgs = localb.aiw();
            if ((paramAnonymousVarArgs != null) && (paramAnonymousContext != null)) {
              paramAnonymousVarArgs.a(paramAnonymousContext, paramAnonymousa, 1, str1, localb.aix(), localb.getPosition());
            }
            GMTrace.o(20419482484736L, 152137);
            return true;
            localIntent.putExtra("Contact_User", str1);
            localIntent.putExtra("Contact_Alias", localbbb.gCC);
            localIntent.putExtra("Contact_Nick", str2);
            localIntent.putExtra("Contact_Signature", localbbb.gCA);
            localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(localbbb.gCG, localbbb.gCy, localbbb.gCz));
            localIntent.putExtra("Contact_Sex", localbbb.gCx);
            localIntent.putExtra("Contact_VUser_Info", localbbb.uAw);
            localIntent.putExtra("Contact_VUser_Info_Flag", localbbb.uAv);
            localIntent.putExtra("Contact_KWeibo_flag", localbbb.uAz);
            localIntent.putExtra("Contact_KWeibo", localbbb.uAx);
            localIntent.putExtra("Contact_KWeiboNick", localbbb.uAy);
            localIntent.putExtra("Contact_Scene", 55);
            if (localbbb.uAC != null) {
              try
              {
                localIntent.putExtra("Contact_customInfo", localbbb.uAC.toByteArray());
              }
              catch (IOException localIOException)
              {
                w.printErrStackTrace("MicroMsg.BizRecommDataItem", localIOException, "", new Object[0]);
              }
            }
          }
        }
        
        public final View b(Context paramAnonymousContext, View paramAnonymousView)
        {
          GMTrace.i(10910961762304L, 81293);
          View localView = paramAnonymousView;
          if (paramAnonymousView == null) {
            localView = View.inflate(paramAnonymousContext, R.i.cFv, null);
          }
          GMTrace.o(10910961762304L, 81293);
          return localView;
        }
      };
    }
    a.b localb = jtx;
    GMTrace.o(20417737654272L, 152124);
    return localb;
  }
  
  public final com.tencent.mm.ui.base.sortview.a.a aih()
  {
    GMTrace.i(20417871872000L, 152125);
    a locala = new a();
    GMTrace.o(20417871872000L, 152125);
    return locala;
  }
  
  public static final class a
    extends com.tencent.mm.plugin.brandservice.a.a.a
    implements com.tencent.mm.ui.base.sortview.a.a
  {
    public TextView jpV;
    public TextView jtq;
    public View jts;
    public TextView jtt;
    public View jtw;
    
    public a()
    {
      GMTrace.i(10861569638400L, 80925);
      GMTrace.o(10861569638400L, 80925);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
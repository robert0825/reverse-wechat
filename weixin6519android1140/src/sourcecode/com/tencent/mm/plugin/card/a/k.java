package com.tencent.mm.plugin.card.a;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.g;
import com.tencent.mm.plugin.card.model.h;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class k
{
  private List<WeakReference<a>> jwK;
  public List<g> jxx;
  public int jxy;
  
  public k()
  {
    GMTrace.i(5119601016832L, 38144);
    this.jwK = new ArrayList();
    this.jxx = new ArrayList();
    this.jxy = 0;
    loadFromDB();
    at.AR();
    Object localObject = com.tencent.mm.y.c.xh().get(139268, null);
    if (localObject == null) {}
    for (int i = 0;; i = ((Integer)localObject).intValue())
    {
      this.jxy = i;
      GMTrace.o(5119601016832L, 38144);
      return;
    }
  }
  
  public static void akb()
  {
    GMTrace.i(5121345847296L, 38157);
    w.i("MicroMsg.CardMsgManager", "clearRedDotAndWording()");
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5129264693248L, 38216);
        w.i("MicroMsg.CardMsgManager", "begin to clearRedDotAndWording()");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vra, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrg, Integer.valueOf(0));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrd, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vre, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrf, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrr, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrs, Boolean.valueOf(false));
        if (com.tencent.mm.s.c.vK().aE(262152, 266256)) {
          com.tencent.mm.s.c.vK().l(262152, false);
        }
        if (com.tencent.mm.s.c.vK().aD(262152, 266256)) {
          com.tencent.mm.s.c.vK().k(262152, false);
        }
        if (com.tencent.mm.s.c.vK().a(w.a.vqU, w.a.vqW)) {
          com.tencent.mm.s.c.vK().a(w.a.vqU, false);
        }
        if (com.tencent.mm.s.c.vK().a(w.a.vqV, w.a.vqX)) {
          com.tencent.mm.s.c.vK().a(w.a.vqV, false);
        }
        w.i("MicroMsg.CardMsgManager", "end to clearRedDotAndWording()");
        GMTrace.o(5129264693248L, 38216);
      }
    }, "clearRedDotAndWording");
    GMTrace.o(5121345847296L, 38157);
  }
  
  public static void c(g paramg)
  {
    GMTrace.i(5120272105472L, 38149);
    if (!al.akp().b(paramg)) {
      w.e("MicroMsg.CardMsgManager", "insert CardMsgInfo failed! id:" + paramg.field_msg_id);
    }
    GMTrace.o(5120272105472L, 38149);
  }
  
  public static boolean d(g paramg)
  {
    GMTrace.i(5121077411840L, 38155);
    if (paramg == null)
    {
      GMTrace.o(5121077411840L, 38155);
      return false;
    }
    boolean bool = al.akp().a(paramg, new String[0]);
    if (!bool) {
      w.e("MicroMsg.CardMsgManager", "delete CardMsgInfo failed! id:" + paramg.field_msg_id);
    }
    GMTrace.o(5121077411840L, 38155);
    return bool;
  }
  
  public static String f(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(5120540540928L, 38151);
    StringBuilder localStringBuilder1 = new StringBuilder();
    int i = 0;
    if (i < 100)
    {
      StringBuilder localStringBuilder2 = new StringBuilder().append(paramString).append(".jump_buttons");
      if (i > 0) {}
      for (Object localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = localObject;
        if (bg.nm((String)paramMap.get((String)localObject + ".title"))) {
          break label365;
        }
        localStringBuilder1.append("<jump_buttons>");
        localStringBuilder1.append("<title>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject).append(".title").toString()))) + "</title>");
        localStringBuilder1.append("<description>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject).append(".description").toString()))) + "</description>");
        localStringBuilder1.append("<button_wording>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject).append(".button_wording").toString()))) + "</button_wording>");
        localStringBuilder1.append("<jump_url>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject).append(".jump_url").toString()))) + "</jump_url>");
        localStringBuilder1.append("</jump_buttons>");
        i += 1;
        break;
      }
    }
    label365:
    paramMap = new StringBuilder();
    if (!bg.nm(localStringBuilder1.toString()))
    {
      paramMap.append("<jump_buttons_list>");
      paramMap.append(localStringBuilder1.toString());
      paramMap.append("</jump_buttons_list>");
    }
    paramMap = paramMap.toString();
    GMTrace.o(5120540540928L, 38151);
    return paramMap;
  }
  
  public static String g(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(5120674758656L, 38152);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if (i < 100)
    {
      Object localObject2 = new StringBuilder().append(paramString).append(".accept_buttons");
      if (i > 0) {}
      for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
      {
        localObject1 = localObject1;
        localObject2 = (String)paramMap.get((String)localObject1 + ".card_id");
        String str = (String)paramMap.get((String)localObject1 + ".title");
        if ((bg.nm((String)localObject2)) && (bg.nm(str))) {
          break label527;
        }
        localStringBuilder.append("<accept_buttons>");
        localStringBuilder.append("<title>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".title").toString()))) + "</title>");
        localStringBuilder.append("<sub_title>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".sub_title").toString()))) + "</sub_title>");
        localStringBuilder.append("<card_id>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".card_id").toString()))) + "</card_id>");
        localStringBuilder.append("<card_ext>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".card_ext").toString()))) + "</card_ext>");
        localStringBuilder.append("<end_time>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".end_time").toString()))) + "</end_time>");
        localStringBuilder.append("<action_type>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject1).append(".action_type").toString()))) + "</action_type>");
        localStringBuilder.append("</accept_buttons>");
        i += 1;
        break;
      }
    }
    label527:
    paramMap = new StringBuilder();
    if (!bg.nm(localStringBuilder.toString()))
    {
      paramMap.append("<accept_buttons_list>");
      paramMap.append(localStringBuilder.toString());
      paramMap.append("</accept_buttons_list>");
    }
    paramMap = paramMap.toString();
    GMTrace.o(5120674758656L, 38152);
    return paramMap;
  }
  
  public static String h(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(18900674674688L, 140821);
    StringBuilder localStringBuilder1 = new StringBuilder();
    int i = 0;
    if (i < 100)
    {
      StringBuilder localStringBuilder2 = new StringBuilder().append(paramString).append(".unavailable_qr_code_list");
      if (i > 0) {}
      for (Object localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = localObject;
        if (bg.nm((String)paramMap.get((String)localObject + ".code_id"))) {
          break label193;
        }
        localStringBuilder1.append("<unavailable_qr_codes>");
        localStringBuilder1.append("<code_id>" + bg.Sw(bg.nl((String)paramMap.get(new StringBuilder().append((String)localObject).append(".code_id").toString()))) + "</code_id>");
        localStringBuilder1.append("</unavailable_qr_codes>");
        i += 1;
        break;
      }
    }
    label193:
    paramMap = new StringBuilder();
    if (!bg.nm(localStringBuilder1.toString()))
    {
      paramMap.append("<unavailable_qr_code_list>");
      paramMap.append(localStringBuilder1.toString());
      paramMap.append("</unavailable_qr_code_list>");
    }
    paramMap = paramMap.toString();
    GMTrace.o(18900674674688L, 140821);
    return paramMap;
  }
  
  private void loadFromDB()
  {
    GMTrace.i(5120406323200L, 38150);
    Cursor localCursor = al.akp().Mx();
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      localCursor.moveToFirst();
      int i = localCursor.getColumnIndex("card_type");
      int j = localCursor.getColumnIndex("title");
      int k = localCursor.getColumnIndex("description");
      int m = localCursor.getColumnIndex("logo_url");
      int n = localCursor.getColumnIndex("time");
      int i1 = localCursor.getColumnIndex("card_id");
      int i2 = localCursor.getColumnIndex("card_tp_id");
      int i3 = localCursor.getColumnIndex("msg_id");
      int i4 = localCursor.getColumnIndex("msg_type");
      int i5 = localCursor.getColumnIndex("jump_type");
      int i6 = localCursor.getColumnIndex("url");
      int i7 = localCursor.getColumnIndex("buttonData");
      int i8 = localCursor.getColumnIndex("operData");
      int i9 = localCursor.getColumnIndex("report_scene");
      int i10 = localCursor.getColumnIndex("read_state");
      while (!localCursor.isAfterLast())
      {
        g localg = new g();
        localg.field_card_type = localCursor.getInt(i);
        localg.field_title = localCursor.getString(j);
        localg.field_description = localCursor.getString(k);
        localg.field_logo_url = localCursor.getString(m);
        localg.field_time = localCursor.getInt(n);
        localg.field_card_id = localCursor.getString(i1);
        localg.field_card_tp_id = localCursor.getString(i2);
        localg.field_msg_id = localCursor.getString(i3);
        localg.field_msg_type = localCursor.getInt(i4);
        localg.field_jump_type = localCursor.getInt(i5);
        localg.field_url = localCursor.getString(i6);
        localg.field_buttonData = localCursor.getBlob(i7);
        localg.field_operData = localCursor.getBlob(i8);
        localg.field_report_scene = localCursor.getInt(i9);
        localg.field_read_state = localCursor.getInt(i10);
        localCursor.moveToNext();
        this.jxx.add(localg);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(5120406323200L, 38150);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5120003670016L, 38147);
    if (this.jwK == null) {
      this.jwK = new ArrayList();
    }
    if (parama != null) {
      this.jwK.add(new WeakReference(parama));
    }
    GMTrace.o(5120003670016L, 38147);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(5119735234560L, 38145);
    if (this.jwK == null)
    {
      GMTrace.o(5119735234560L, 38145);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).a(paramg);
        }
      }
      i += 1;
    }
    GMTrace.o(5119735234560L, 38145);
  }
  
  public final void aic()
  {
    GMTrace.i(5119869452288L, 38146);
    if (this.jwK == null)
    {
      GMTrace.o(5119869452288L, 38146);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).aic();
        }
      }
      i += 1;
    }
    GMTrace.o(5119869452288L, 38146);
  }
  
  public final void aka()
  {
    GMTrace.i(5121211629568L, 38156);
    this.jxy = 0;
    at.AR();
    com.tencent.mm.y.c.xh().set(139268, Integer.valueOf(this.jxy));
    GMTrace.o(5121211629568L, 38156);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5120137887744L, 38148);
    if ((this.jwK == null) || (parama == null))
    {
      GMTrace.o(5120137887744L, 38148);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.jwK.remove(localWeakReference);
          GMTrace.o(5120137887744L, 38148);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5120137887744L, 38148);
  }
  
  public final boolean tQ(String paramString)
  {
    GMTrace.i(5120808976384L, 38153);
    if ((this.jxx == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(5120808976384L, 38153);
      return false;
    }
    int i = 0;
    while (i < this.jxx.size())
    {
      g localg = (g)this.jxx.get(i);
      if ((localg != null) && (localg.field_msg_id != null) && (localg.field_msg_id.equals(paramString)))
      {
        GMTrace.o(5120808976384L, 38153);
        return true;
      }
      i += 1;
    }
    GMTrace.o(5120808976384L, 38153);
    return false;
  }
  
  public final boolean tR(String paramString)
  {
    GMTrace.i(5120943194112L, 38154);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5120943194112L, 38154);
      return false;
    }
    Object localObject;
    if ((this.jxx == null) || (TextUtils.isEmpty(paramString))) {
      localObject = null;
    }
    while (localObject != null)
    {
      this.jxx.remove(localObject);
      d((g)localObject);
      GMTrace.o(5120943194112L, 38154);
      return true;
      int i = 0;
      for (;;)
      {
        if (i >= this.jxx.size()) {
          break label126;
        }
        g localg = (g)this.jxx.get(i);
        localObject = localg;
        if (paramString.equals(localg.field_msg_id)) {
          break;
        }
        i += 1;
      }
      label126:
      localObject = null;
    }
    GMTrace.o(5120943194112L, 38154);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(g paramg);
    
    public abstract void aic();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
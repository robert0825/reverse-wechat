package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.provider.ContactsContract.Contacts;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.appstorage.e;
import com.tencent.mm.plugin.appbrand.appstorage.e.a;
import com.tencent.mm.plugin.appbrand.appstorage.e.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 226;
  public static final String NAME = "addPhoneContact";
  private e idX;
  
  public a()
  {
    GMTrace.i(19805167943680L, 147560);
    GMTrace.o(19805167943680L, 147560);
  }
  
  private static e.a a(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(19805436379136L, 147562);
    paramJSONObject = new e.a(paramJSONObject.optString(paramString + "Country"), paramJSONObject.optString(paramString + "State"), paramJSONObject.optString(paramString + "City"), paramJSONObject.optString(paramString + "Street"), paramJSONObject.optString(paramString + "PostalCode"));
    GMTrace.o(19805436379136L, 147562);
    return paramJSONObject;
  }
  
  private static void a(ArrayList<ContentValues> paramArrayList, e.a parama, int paramInt)
  {
    GMTrace.i(19805704814592L, 147564);
    if ((parama != null) && (parama.KI().length() > 0))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
      localContentValues.put("data1", parama.KI());
      localContentValues.put("data9", parama.hLU);
      localContentValues.put("data2", Integer.valueOf(paramInt));
      paramArrayList.add(localContentValues);
    }
    GMTrace.o(19805704814592L, 147564);
  }
  
  private static void a(ArrayList<ContentValues> paramArrayList, String paramString, int paramInt)
  {
    GMTrace.i(19805839032320L, 147565);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
    localContentValues.put("data1", paramString);
    localContentValues.put("data2", Integer.valueOf(paramInt));
    paramArrayList.add(localContentValues);
    GMTrace.o(19805839032320L, 147565);
  }
  
  public final void a(Intent paramIntent, MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(19805570596864L, 147563);
    paramIntent.setFlags(268435456);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.idX.hLF;
    Object localObject2 = new StringBuilder();
    if ((bg.Sg(((e.b)localObject1).hLV)) || (bg.Sg(((e.b)localObject1).hLW)) || (bg.Sg(((e.b)localObject1).hLX)))
    {
      if (((e.b)localObject1).hLX.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).hLX);
      }
      if (((e.b)localObject1).hLW.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).hLW);
      }
      if (((e.b)localObject1).hLV.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).hLV);
      }
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject2).toString();
      if (!bg.nm((String)localObject1))
      {
        paramIntent.putExtra("name", (String)localObject1);
        if (!bg.nm(this.idX.aDn))
        {
          localObject1 = this.idX.aDn;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/nickname");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject2);
        }
        if (!bg.nm(this.idX.hLO))
        {
          localObject1 = this.idX.hLO;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/note");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          localArrayList.add(localObject2);
        }
        if ((!bg.nm(this.idX.hLP)) || (!bg.nm(this.idX.title)))
        {
          localObject1 = new ContentValues();
          ((ContentValues)localObject1).put("mimetype", "vnd.android.cursor.item/organization");
          if (!bg.nm(this.idX.hLP)) {
            ((ContentValues)localObject1).put("data1", this.idX.hLP);
          }
          if (!bg.nm(this.idX.title)) {
            ((ContentValues)localObject1).put("data4", this.idX.title);
          }
          ((ContentValues)localObject1).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject1);
        }
        if (!bg.nm(this.idX.url))
        {
          localObject1 = this.idX.url;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/website");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject2);
        }
        if (!bg.nm(this.idX.fjd)) {
          paramIntent.putExtra("email", this.idX.fjd);
        }
        if (!bg.nm(this.idX.hLK)) {
          a(localArrayList, this.idX.hLK, 2);
        }
        if (!bg.nm(this.idX.hLL)) {
          a(localArrayList, this.idX.hLL, 1);
        }
        if (!bg.nm(this.idX.hLN)) {
          a(localArrayList, this.idX.hLN, 3);
        }
        if (!bg.nm(this.idX.hLM)) {
          a(localArrayList, this.idX.hLM, 10);
        }
        if (!bg.nm(this.idX.hLR)) {
          a(localArrayList, this.idX.hLR, 5);
        }
        if (!bg.nm(this.idX.hLQ)) {
          a(localArrayList, this.idX.hLQ, 4);
        }
        a(localArrayList, this.idX.hLJ, 3);
        a(localArrayList, this.idX.hLI, 2);
        a(localArrayList, this.idX.hLH, 1);
        if (!bg.nm(this.idX.hLS))
        {
          localObject1 = this.idX.hLS;
          paramMMActivity = paramMMActivity.getString(o.i.app_name);
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/im");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data5", Integer.valueOf(-1));
          ((ContentValues)localObject2).put("data6", paramMMActivity);
          localArrayList.add(localObject2);
        }
        paramMMActivity = c.aJ(paramString, this.idX.hLG);
        if ((paramMMActivity != null) && (!bg.nm(paramMMActivity.gpy)))
        {
          paramString = paramMMActivity.gpy;
          paramMMActivity = paramString;
          if (!paramString.startsWith("file://")) {
            paramMMActivity = "file://" + paramString;
          }
          paramMMActivity = b.CT().hx(paramMMActivity);
          if (paramMMActivity != null)
          {
            paramString = new ByteArrayOutputStream();
            paramMMActivity.compress(Bitmap.CompressFormat.JPEG, 100, paramString);
            localObject1 = paramString.toByteArray();
            localObject2 = new ContentValues();
            ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/photo");
            ((ContentValues)localObject2).put("data15", (byte[])localObject1);
            localArrayList.add(localObject2);
            paramMMActivity.recycle();
          }
        }
      }
      try
      {
        paramString.close();
        paramIntent.putParcelableArrayListExtra("data", localArrayList);
        GMTrace.o(19805570596864L, 147563);
        return;
        if (((e.b)localObject1).hLV.trim().length() > 0) {
          ((StringBuilder)localObject2).append(((e.b)localObject1).hLV);
        }
        if (((e.b)localObject1).hLW.trim().length() > 0)
        {
          ((StringBuilder)localObject2).append(" ");
          ((StringBuilder)localObject2).append(((e.b)localObject1).hLW);
        }
        if (((e.b)localObject1).hLX.trim().length() <= 0) {
          continue;
        }
        ((StringBuilder)localObject2).append(" ");
        ((StringBuilder)localObject2).append(((e.b)localObject1).hLX);
        continue;
        w.e("MicroMsg.JsApiAddPhoneContact", "no contact user name");
      }
      catch (IOException paramMMActivity)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.JsApiAddPhoneContact", paramMMActivity, "", new Object[0]);
        }
      }
    }
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19805302161408L, 147561);
    w.d("MicroMsg.JsApiAddPhoneContact", "addPhoneContact!");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "data is null");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    if (bg.nm(paramJSONObject.optString("firstName")))
    {
      paramj.v(paramInt, d("fail:firstName is null", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    final MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "mmActivity is null, invoke fail!");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    this.idX = new e();
    this.idX.hLG = paramJSONObject.optString("photoFilePath");
    this.idX.aDn = paramJSONObject.optString("nickName");
    final Object localObject = new e.b(paramJSONObject.optString("firstName"), paramJSONObject.optString("middleName"), paramJSONObject.optString("lastName"));
    this.idX.hLF = ((e.b)localObject);
    this.idX.hLO = paramJSONObject.optString("remark");
    this.idX.hLK = paramJSONObject.optString("mobilePhoneNumber");
    this.idX.hLS = paramJSONObject.optString("weChatNumber");
    this.idX.hLJ = a(paramJSONObject, "address");
    this.idX.hLP = paramJSONObject.optString("organization");
    this.idX.title = paramJSONObject.optString("title");
    this.idX.hLQ = paramJSONObject.optString("workFaxNumber");
    this.idX.hLN = paramJSONObject.optString("workPhoneNumber");
    this.idX.hLM = paramJSONObject.optString("hostNumber");
    this.idX.fjd = paramJSONObject.optString("email");
    this.idX.url = paramJSONObject.optString("url");
    this.idX.hLI = a(paramJSONObject, "workAddress");
    this.idX.hLR = paramJSONObject.optString("homeFaxNumber");
    this.idX.hLL = paramJSONObject.optString("homePhoneNumber");
    this.idX.hLH = a(paramJSONObject, "homeAddress");
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(20368345530368L, 151756);
        paramj.v(paramInt, a.this.d("ok", null));
        GMTrace.o(20368345530368L, 151756);
      }
    };
    localObject = paramj.hyD;
    paramj = localMMActivity.getString(o.i.hGg);
    paramJSONObject = localMMActivity.getString(o.i.hGf);
    localObject = new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(19805033725952L, 147559);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(19805033725952L, 147559);
          return;
          Intent localIntent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
          a.this.a(localIntent, localMMActivity, localObject);
          localMMActivity.startActivity(localIntent);
          localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
          GMTrace.o(19805033725952L, 147559);
          return;
          localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
          localIntent.setType("vnd.android.cursor.item/person");
          a.this.a(localIntent, localMMActivity, localObject);
          localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
        }
      }
    };
    h.a(localMMActivity, "", new String[] { paramj, paramJSONObject }, "", (h.c)localObject);
    GMTrace.o(19805302161408L, 147561);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
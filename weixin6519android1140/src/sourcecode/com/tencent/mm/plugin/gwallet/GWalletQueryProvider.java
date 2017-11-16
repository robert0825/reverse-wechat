package com.tencent.mm.plugin.gwallet;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.a;
import com.tencent.mm.plugin.gwallet.a.b.c;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class GWalletQueryProvider
  extends ContentProvider
{
  public static final String[] sA;
  private final String TAG;
  private Context mContext;
  private b mgf;
  private boolean mgg;
  private boolean mgh;
  private ArrayList<String> mgi;
  private ArrayList<String> mgj;
  private int mgk;
  
  static
  {
    GMTrace.i(8970978721792L, 66839);
    sA = new String[] { "_id", "product_id", "full_price", "product_state", "price_currency", "price_amount" };
    GMTrace.o(8970978721792L, 66839);
  }
  
  public GWalletQueryProvider()
  {
    GMTrace.i(8969099673600L, 66825);
    this.TAG = "MicroMsg.GWalletQueryProvider";
    this.mgf = null;
    this.mContext = null;
    GMTrace.o(8969099673600L, 66825);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(8969233891328L, 66826);
    GMTrace.o(8969233891328L, 66826);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(8969368109056L, 66827);
    GMTrace.o(8969368109056L, 66827);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(8969502326784L, 66828);
    GMTrace.o(8969502326784L, 66828);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(8969636544512L, 66829);
    w.d("MicroMsg.GWalletQueryProvider", "successfully loaded");
    GMTrace.o(8969636544512L, 66829);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(8969770762240L, 66830);
    try
    {
      w.d("MicroMsg.GWalletQueryProvider", "Creating IAB helper.");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
      {
        w.d("MicroMsg.GWalletQueryProvider", "no product id selected or size is 0");
        throw new IllegalArgumentException("no product id selected or size is 0");
      }
    }
    finally {}
    this.mContext = getContext();
    this.mgf = new b(this.mContext);
    this.mgg = true;
    this.mgh = false;
    this.mgj = new ArrayList();
    int j = paramArrayOfString2.length;
    int i = 0;
    while (i < j)
    {
      paramUri = paramArrayOfString2[i];
      this.mgj.add(paramUri);
      i += 1;
    }
    w.d("MicroMsg.GWalletQueryProvider", "Starting setup.");
    this.mgf.a(new b.a()
    {
      public final void a(c paramAnonymousc)
      {
        GMTrace.i(8968965455872L, 66824);
        w.d("MicroMsg.GWalletQueryProvider", "Setup finished.");
        if (!paramAnonymousc.isSuccess())
        {
          w.e("MicroMsg.GWalletQueryProvider", "Problem setting up in-app billing: " + paramAnonymousc);
          GWalletQueryProvider.a(GWalletQueryProvider.this);
          if (GWalletQueryProvider.b(GWalletQueryProvider.this) != null) {
            GWalletQueryProvider.b(GWalletQueryProvider.this).dispose();
          }
          GWalletQueryProvider.c(GWalletQueryProvider.this);
          GMTrace.o(8968965455872L, 66824);
          return;
        }
        h.xB().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(8967891714048L, 66816);
            GWalletQueryProvider.d(GWalletQueryProvider.this);
            GMTrace.o(8967891714048L, 66816);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(8968025931776L, 66817);
            if (GWalletQueryProvider.b(GWalletQueryProvider.this) != null) {
              GWalletQueryProvider.b(GWalletQueryProvider.this).dispose();
            }
            GWalletQueryProvider.c(GWalletQueryProvider.this);
            GMTrace.o(8968025931776L, 66817);
            return true;
          }
          
          public final String toString()
          {
            GMTrace.i(8968160149504L, 66818);
            String str = super.toString() + "|onIabSetupFinished";
            GMTrace.o(8968160149504L, 66818);
            return str;
          }
        });
        GMTrace.o(8968965455872L, 66824);
      }
    });
    long l = 0L;
    boolean bool;
    while ((l <= 30000L) && (this.mgg))
    {
      bool = this.mgh;
      if (bool) {
        break;
      }
      try
      {
        Thread.sleep(100L);
        l += 100L;
      }
      catch (InterruptedException paramUri)
      {
        w.e("MicroMsg.GWalletQueryProvider", paramUri.toString());
      }
    }
    if (!this.mgg)
    {
      w.d("MicroMsg.GWalletQueryProvider", "unable to setup");
      paramUri = new MatrixCursor(sA);
      paramArrayOfString1 = this.mgj.iterator();
      while (paramArrayOfString1.hasNext()) {
        paramUri.addRow(new Object[] { Integer.valueOf(0), (String)paramArrayOfString1.next(), "", Integer.valueOf(10234), "", "" });
      }
      GMTrace.o(8969770762240L, 66830);
      return paramUri;
    }
    if (l > 30000L)
    {
      w.d("MicroMsg.GWalletQueryProvider", "time's out");
      paramUri = new MatrixCursor(sA);
      paramArrayOfString1 = this.mgj.iterator();
      while (paramArrayOfString1.hasNext()) {
        paramUri.addRow(new Object[] { Integer.valueOf(0), (String)paramArrayOfString1.next(), "", Integer.valueOf(10235), "", "" });
      }
      GMTrace.o(8969770762240L, 66830);
      return paramUri;
    }
    w.d("MicroMsg.GWalletQueryProvider", "successfully queried!");
    paramArrayOfString1 = new MatrixCursor(sA);
    if (this.mgk == 0)
    {
      i = 0;
      if (this.mgi != null)
      {
        paramString1 = this.mgi.iterator();
        i = 0;
        for (;;)
        {
          if (!paramString1.hasNext()) {
            break label818;
          }
          paramUri = (String)paramString1.next();
          bool = bg.nm(paramUri);
          if (bool) {
            break label815;
          }
          try
          {
            localObject = new JSONObject(paramUri);
            paramUri = ((JSONObject)localObject).getString("productId");
            paramArrayOfString2 = ((JSONObject)localObject).getString("price");
            paramString2 = ((JSONObject)localObject).getString("price_currency_code");
            localObject = ((JSONObject)localObject).getString("price_amount_micros");
            j = i + 1;
          }
          catch (JSONException paramUri)
          {
            try
            {
              Object localObject;
              paramArrayOfString1.addRow(new Object[] { Integer.valueOf(i), paramUri, paramArrayOfString2, Integer.valueOf(10232), paramString2, localObject });
              this.mgj.remove(paramUri);
              i = j;
            }
            catch (JSONException paramUri)
            {
              for (;;)
              {
                i = j;
              }
            }
            paramUri = paramUri;
          }
        }
        w.d("MicroMsg.GWalletQueryProvider", paramUri.toString());
        break label815;
      }
    }
    label815:
    label818:
    for (;;)
    {
      paramUri = this.mgj.iterator();
      while (paramUri.hasNext())
      {
        paramArrayOfString1.addRow(new Object[] { Integer.valueOf(i), (String)paramUri.next(), "", Integer.valueOf(10233), "", "" });
        i += 1;
        continue;
        paramUri = this.mgj.iterator();
        while (paramUri.hasNext()) {
          paramArrayOfString1.addRow(new Object[] { Integer.valueOf(0), (String)paramUri.next(), "", Integer.valueOf(10236), "", "" });
        }
      }
      GMTrace.o(8969770762240L, 66830);
      return paramArrayOfString1;
      break;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(8969904979968L, 66831);
    GMTrace.o(8969904979968L, 66831);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\gwallet\GWalletQueryProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
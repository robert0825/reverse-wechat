package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dp;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

public final class w
  extends dp
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(6872350326784L, 51203);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_tpa_country";
    locala.vmt.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" wallet_tpa_country TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "wallet_tpa_country";
    locala.columns[1] = "wallet_type";
    locala.vmt.put("wallet_type", "INTEGER");
    localStringBuilder.append(" wallet_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "wallet_name";
    locala.vmt.put("wallet_name", "TEXT");
    localStringBuilder.append(" wallet_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "wallet_selected";
    locala.vmt.put("wallet_selected", "INTEGER");
    localStringBuilder.append(" wallet_selected INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wallet_balance";
    locala.vmt.put("wallet_balance", "INTEGER");
    localStringBuilder.append(" wallet_balance INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wallet_tpa_country_mask";
    locala.vmt.put("wallet_tpa_country_mask", "INTEGER");
    localStringBuilder.append(" wallet_tpa_country_mask INTEGER");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6872350326784L, 51203);
  }
  
  public w()
  {
    GMTrace.i(6871947673600L, 51200);
    GMTrace.o(6871947673600L, 51200);
  }
  
  public static w T(JSONObject paramJSONObject)
  {
    GMTrace.i(6872216109056L, 51202);
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WalletKindInfo", "json is null");
      GMTrace.o(6872216109056L, 51202);
      return null;
    }
    w localw = new w();
    localw.field_wallet_tpa_country = paramJSONObject.optString("wallet_tpa_country");
    localw.field_wallet_name = paramJSONObject.optString("wallet_name");
    localw.field_wallet_selected = paramJSONObject.optInt("wallet_selected");
    localw.field_wallet_type = paramJSONObject.optInt("wallet_type");
    localw.field_wallet_balance = paramJSONObject.optInt("wallet_balance");
    localw.field_wallet_tpa_country_mask = paramJSONObject.optInt("wallet_tpa_country_mask");
    if (bg.nm(localw.field_wallet_tpa_country))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
      GMTrace.o(6872216109056L, 51202);
      return null;
    }
    GMTrace.o(6872216109056L, 51202);
    return localw;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6872081891328L, 51201);
    c.a locala = fTp;
    GMTrace.o(6872081891328L, 51201);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
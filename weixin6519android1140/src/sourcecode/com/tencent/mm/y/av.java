package com.tencent.mm.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.s;

public final class av
{
  public static SharedPreferences AX()
  {
    GMTrace.i(13489150099456L, 100502);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("auth_info_key_prefs", 4);
    if (!localSharedPreferences.getBoolean("key_auth_info_prefs_created", false))
    {
      d.oqe.a(148L, 12L, 1L, true);
      Object localObject = new s(com.tencent.mm.storage.w.ghv + "autoauth.cfg");
      if ((!((s)localObject).vpt) && (((s)localObject).get(3) != null))
      {
        localEditor = localSharedPreferences.edit();
        localEditor.putBoolean("key_auth_info_prefs_created", true);
        localEditor.putInt("key_auth_update_version", ((Integer)((s)localObject).get(1)).intValue());
        localEditor.putInt("_auth_uin", ((Integer)((s)localObject).get(2)).intValue());
        localEditor.putString("_auth_key", (String)((s)localObject).get(3));
        localEditor.putString("server_id", (String)((s)localObject).get(4));
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use autoauthcfg now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(localEditor.commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
        d.oqe.a(148L, 51L, 1L, true);
        GMTrace.o(13489150099456L, 100502);
        return localSharedPreferences;
      }
      localObject = ab.getContext().getSharedPreferences("auto_auth_key_prefs", 4);
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      if (bg.nm(((SharedPreferences)localObject).getString("_auth_key", ""))) {
        break label528;
      }
      localEditor.putBoolean("key_auth_info_prefs_created", true);
      localEditor.putInt("key_auth_update_version", ((SharedPreferences)localObject).getInt("key_auth_update_version", 0));
      localEditor.putInt("_auth_uin", ((SharedPreferences)localObject).getInt("_auth_uin", 0));
      localEditor.putString("_auth_key", ((SharedPreferences)localObject).getString("_auth_key", ""));
      localEditor.putString("server_id", ab.getContext().getSharedPreferences("server_id_prefs", 4).getString("server_id", ""));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use oldAAKsp now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(localEditor.commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
    }
    for (;;)
    {
      GMTrace.o(13489150099456L, 100502);
      return localSharedPreferences;
      label528:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! neither autoauthcfg nor oldAAKsp existed just install! stack[%s]", new Object[] { bg.bQW() });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
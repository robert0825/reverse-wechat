package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.j;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.w;

public final class aj
{
  public static a<Long> aeA;
  public static a<Long> aeB;
  public static a<Integer> aeC;
  public static a<Integer> aeD;
  public static a<String> aeE;
  public static a<String> aeF;
  public static a<String> aeG;
  public static a<String> aeH;
  public static a<Integer> aeI;
  public static a<String> aeJ;
  public static a<String> aeK;
  public static a<Integer> aeL = a.a("analytics.max_hits_per_request.k", 20, 20);
  public static a<Integer> aeM = a.a("analytics.max_hit_length.k", 8192, 8192);
  public static a<Integer> aeN = a.a("analytics.max_post_length.k", 8192, 8192);
  public static a<Integer> aeO = a.a("analytics.max_batch_post_length", 8192, 8192);
  public static a<String> aeP = a.a("analytics.fallback_responses.k", "404,502", "404,502");
  public static a<Integer> aeQ = a.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
  public static a<Long> aeR = a.a("analytics.service_monitor_interval", 86400000L, 86400000L);
  public static a<Integer> aeS = a.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
  public static a<Integer> aeT = a.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
  public static a<Long> aeU = a.a("analytics.campaigns.time_limit", 86400000L, 86400000L);
  public static a<String> aeV = a.a("analytics.first_party_experiment_id", "", "");
  public static a<Integer> aeW = a.a("analytics.first_party_experiment_variant", 0, 0);
  public static a<Boolean> aeX = a.c("analytics.test.disable_receiver", false);
  public static a<Long> aeY = a.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
  public static a<Long> aeZ = a.a("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
  public static a<Boolean> aeo = a.c("analytics.service_enabled", false);
  public static a<Boolean> aep = a.c("analytics.service_client_enabled", true);
  public static a<String> aeq = a.a("analytics.log_tag", "GAv4", "GAv4-SVC");
  public static a<Long> aer = a.a("analytics.max_tokens", 60L, 60L);
  public static a<Float> aes = new a(j.a("analytics.tokens_per_sec", Float.valueOf(0.5F)), Float.valueOf(0.5F));
  public static a<Integer> aet = a.a("analytics.max_stored_hits", 2000, 20000);
  public static a<Integer> aeu = a.a("analytics.max_stored_hits_per_app", 2000, 2000);
  public static a<Integer> aev = a.a("analytics.max_stored_properties_per_app", 100, 100);
  public static a<Long> aew = a.a("analytics.local_dispatch_millis", 1800000L, 120000L);
  public static a<Long> aex = a.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
  public static a<Long> aey = a.a("analytics.min_local_dispatch_millis", 120000L, 120000L);
  public static a<Long> aez = a.a("analytics.max_local_dispatch_millis", 7200000L, 7200000L);
  public static a<Long> afa = a.a("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
  public static a<Long> afb = a.a("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
  public static a<Long> afc = a.a("analytics.service_client.reconnect_throttle_millis", 1800000L, 1800000L);
  public static a<Long> afd = a.a("analytics.monitoring.sample_period_millis", 86400000L, 86400000L);
  public static a<Long> afe = a.a("analytics.initialization_warning_threshold", 5000L, 5000L);
  
  static
  {
    aeA = a.a("analytics.dispatch_alarm_millis", 7200000L, 7200000L);
    aeB = a.a("analytics.max_dispatch_alarm_millis", 32400000L, 32400000L);
    aeC = a.a("analytics.max_hits_per_dispatch", 20, 20);
    aeD = a.a("analytics.max_hits_per_batch", 20, 20);
    aeE = a.a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
    aeF = a.a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
    aeG = a.a("analytics.simple_endpoint", "/collect", "/collect");
    aeH = a.a("analytics.batching_endpoint", "/batch", "/batch");
    aeI = a.a("analytics.max_get_length", 2036, 2036);
    aeJ = a.a("analytics.batching_strategy.k", x.adS.name(), x.adS.name());
    String str = z.adY.name();
    aeK = a.a("analytics.compression_strategy.k", str, str);
  }
  
  public static final class a<V>
  {
    private final V aff;
    private final j<V> afg;
    private V afh;
    
    a(j<V> paramj, V paramV)
    {
      w.aa(paramj);
      this.afg = paramj;
      this.aff = paramV;
    }
    
    static a<Integer> a(String paramString, int paramInt1, int paramInt2)
    {
      return new a(j.a(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
    }
    
    static a<Long> a(String paramString, long paramLong1, long paramLong2)
    {
      return new a(j.a(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
    }
    
    static a<String> a(String paramString1, String paramString2, String paramString3)
    {
      return new a(j.j(paramString1, paramString3), paramString2);
    }
    
    static a<Boolean> c(String paramString, boolean paramBoolean)
    {
      return new a(j.e(paramString, paramBoolean), Boolean.valueOf(paramBoolean));
    }
    
    public final V get()
    {
      if (this.afh != null) {
        return (V)this.afh;
      }
      if ((f.akn) && (j.isInitialized())) {
        return (V)this.afg.ll();
      }
      return (V)this.aff;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package c.t.m.g;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;

@SuppressLint({"NewApi"})
final class co
  extends cn
{
  private LruCache<String, Pair<Double, Double>> a = new LruCache(100);
  
  public co(String paramString)
  {
    super(paramString, "check cell");
  }
  
  public final void a()
  {
    super.a();
    this.a.evictAll();
  }
  
  protected final boolean a(Bundle paramBundle)
  {
    String str = paramBundle.getString("cellkey");
    paramBundle = (Location)paramBundle.getParcelable("location");
    if (paramBundle == null) {
      return true;
    }
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    Pair localPair = (Pair)this.a.get(str);
    if (localPair == null)
    {
      paramBundle = Pair.create(Double.valueOf(paramBundle.getLatitude()), Double.valueOf(paramBundle.getLongitude()));
      this.a.put(str, paramBundle);
      return true;
    }
    return b.a.a(paramBundle.getLatitude(), paramBundle.getLongitude(), ((Double)localPair.first).doubleValue(), ((Double)localPair.second).doubleValue()) < 6000.0D;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
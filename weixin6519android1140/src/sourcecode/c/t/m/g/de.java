package c.t.m.g;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class de
  implements Cloneable
{
  private int a;
  private int b;
  private String c;
  private String d;
  private int e;
  private long f;
  
  @SuppressLint({"NewApi"})
  public static de a(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte, String paramString)
  {
    if (paramBluetoothDevice == null) {
      return null;
    }
    int k = 0;
    int i = 2;
    for (;;)
    {
      int j = k;
      if (i <= 5)
      {
        if (((paramArrayOfByte[(i + 2)] & 0xFF) == 2) && ((paramArrayOfByte[(i + 3)] & 0xFF) == 21)) {
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          break;
        }
        de localde = new de();
        localde.a = (((paramArrayOfByte[(i + 20)] & 0xFF) << 8) + (paramArrayOfByte[(i + 21)] & 0xFF));
        localde.b = (((paramArrayOfByte[(i + 22)] & 0xFF) << 8) + (paramArrayOfByte[(i + 23)] & 0xFF));
        localde.e = paramInt;
        localde.d = paramBluetoothDevice.getAddress().toUpperCase();
        paramBluetoothDevice.getName();
        localde.f = System.currentTimeMillis();
        localde.c = paramString;
        return localde;
      }
      i += 1;
    }
  }
  
  public static String a(List<de> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return "[]";
    }
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    for (;;)
    {
      de localde;
      JSONObject localJSONObject;
      if (paramList.hasNext())
      {
        localde = (de)paramList.next();
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("mac", localde.d);
        localJSONObject.put("uuid", localde.c);
        localJSONObject.put("major", localde.a);
        localJSONObject.put("minor", localde.b);
        localJSONObject.put("rssi", localde.e);
        localJSONObject.put("time", localde.f);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException) {}
      return localJSONArray.toString();
    }
  }
  
  public final long a()
  {
    return this.f;
  }
  
  protected final Object clone()
  {
    try
    {
      Object localObject = super.clone();
      return localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public final String toString()
  {
    return "Beacon [major=" + this.a + ",uuid=" + this.c + ", minor=" + this.b + ", bluetoothAddress=" + this.d + ", rssi=" + this.e + ", time=" + this.f + "]";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
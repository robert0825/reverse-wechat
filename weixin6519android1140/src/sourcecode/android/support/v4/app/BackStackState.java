package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator() {};
  final int mIndex;
  final String mName;
  final int[] nU;
  final int nm;
  final int nn;
  final int nr;
  final CharSequence ns;
  final int nt;
  final CharSequence nu;
  final ArrayList<String> nv;
  final ArrayList<String> nw;
  
  public BackStackState(Parcel paramParcel)
  {
    this.nU = paramParcel.createIntArray();
    this.nm = paramParcel.readInt();
    this.nn = paramParcel.readInt();
    this.mName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    this.nr = paramParcel.readInt();
    this.ns = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.nt = paramParcel.readInt();
    this.nu = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.nv = paramParcel.createStringArrayList();
    this.nw = paramParcel.createStringArrayList();
  }
  
  public BackStackState(d paramd)
  {
    d.a locala = paramd.nf;
    int j;
    for (int i = 0; locala != null; i = j)
    {
      j = i;
      if (locala.nP != null) {
        j = i + locala.nP.size();
      }
      locala = locala.nH;
    }
    this.nU = new int[i + paramd.nh * 7];
    if (!paramd.no) {
      throw new IllegalStateException("Not on back stack");
    }
    locala = paramd.nf;
    i = 0;
    if (locala != null)
    {
      int[] arrayOfInt = this.nU;
      j = i + 1;
      arrayOfInt[i] = locala.nJ;
      arrayOfInt = this.nU;
      int k = j + 1;
      if (locala.nK != null) {}
      for (i = locala.nK.mIndex;; i = -1)
      {
        arrayOfInt[j] = i;
        arrayOfInt = this.nU;
        i = k + 1;
        arrayOfInt[k] = locala.nL;
        arrayOfInt = this.nU;
        j = i + 1;
        arrayOfInt[i] = locala.nM;
        arrayOfInt = this.nU;
        i = j + 1;
        arrayOfInt[j] = locala.nN;
        arrayOfInt = this.nU;
        j = i + 1;
        arrayOfInt[i] = locala.nO;
        if (locala.nP == null) {
          break label314;
        }
        k = locala.nP.size();
        arrayOfInt = this.nU;
        i = j + 1;
        arrayOfInt[j] = k;
        j = 0;
        while (j < k)
        {
          this.nU[i] = ((Fragment)locala.nP.get(j)).mIndex;
          j += 1;
          i += 1;
        }
      }
      for (;;)
      {
        locala = locala.nH;
        break;
        label314:
        arrayOfInt = this.nU;
        i = j + 1;
        arrayOfInt[j] = 0;
      }
    }
    this.nm = paramd.nm;
    this.nn = paramd.nn;
    this.mName = paramd.mName;
    this.mIndex = paramd.mIndex;
    this.nr = paramd.nr;
    this.ns = paramd.ns;
    this.nt = paramd.nt;
    this.nu = paramd.nu;
    this.nv = paramd.nv;
    this.nw = paramd.nw;
  }
  
  public final d a(m paramm)
  {
    d locald = new d(paramm);
    int k = 0;
    int i = 0;
    while (i < this.nU.length)
    {
      d.a locala = new d.a();
      Object localObject = this.nU;
      int j = i + 1;
      locala.nJ = localObject[i];
      if (m.DEBUG) {
        new StringBuilder("Instantiate ").append(locald).append(" op #").append(k).append(" base fragment #").append(this.nU[j]);
      }
      localObject = this.nU;
      i = j + 1;
      j = localObject[j];
      if (j >= 0) {}
      for (locala.nK = ((Fragment)paramm.py.get(j));; locala.nK = null)
      {
        localObject = this.nU;
        j = i + 1;
        locala.nL = localObject[i];
        localObject = this.nU;
        i = j + 1;
        locala.nM = localObject[j];
        localObject = this.nU;
        j = i + 1;
        locala.nN = localObject[i];
        localObject = this.nU;
        i = j + 1;
        locala.nO = localObject[j];
        localObject = this.nU;
        j = i + 1;
        int n = localObject[i];
        i = j;
        if (n <= 0) {
          break;
        }
        locala.nP = new ArrayList(n);
        int m = 0;
        for (;;)
        {
          i = j;
          if (m >= n) {
            break;
          }
          if (m.DEBUG) {
            new StringBuilder("Instantiate ").append(locald).append(" set remove fragment #").append(this.nU[j]);
          }
          localObject = (Fragment)paramm.py.get(this.nU[j]);
          locala.nP.add(localObject);
          m += 1;
          j += 1;
        }
      }
      locald.ni = locala.nL;
      locald.nj = locala.nM;
      locald.nk = locala.nN;
      locald.nl = locala.nO;
      locald.a(locala);
      k += 1;
    }
    locald.nm = this.nm;
    locald.nn = this.nn;
    locald.mName = this.mName;
    locald.mIndex = this.mIndex;
    locald.no = true;
    locald.nr = this.nr;
    locald.ns = this.ns;
    locald.nt = this.nt;
    locald.nu = this.nu;
    locald.nv = this.nv;
    locald.nw = this.nw;
    locald.D(1);
    return locald;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.nU);
    paramParcel.writeInt(this.nm);
    paramParcel.writeInt(this.nn);
    paramParcel.writeString(this.mName);
    paramParcel.writeInt(this.mIndex);
    paramParcel.writeInt(this.nr);
    TextUtils.writeToParcel(this.ns, paramParcel, 0);
    paramParcel.writeInt(this.nt);
    TextUtils.writeToParcel(this.nu, paramParcel, 0);
    paramParcel.writeStringList(this.nv);
    paramParcel.writeStringList(this.nw);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\BackStackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
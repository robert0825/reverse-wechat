package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification
  implements SafeParcelable
{
  public static final e CREATOR = new e();
  public static final PasswordSpecification afP = new a().jB().aa("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").ab("abcdefghijkmnopqrstxyz").ab("ABCDEFGHJKLMNPQRSTXY").ab("3456789").jC();
  public static final PasswordSpecification afQ = new a().jB().aa("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").ab("abcdefghijklmnopqrstuvwxyz").ab("ABCDEFGHIJKLMNOPQRSTUVWXYZ").ab("1234567890").jC();
  final String afR;
  final List<String> afS;
  final List<Integer> afT;
  final int afU;
  final int afV;
  private final int[] afW;
  private final Random afX;
  final int mVersionCode;
  
  PasswordSpecification(int paramInt1, String paramString, List<String> paramList, List<Integer> paramList1, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.afR = paramString;
    this.afS = Collections.unmodifiableList(paramList);
    this.afT = Collections.unmodifiableList(paramList1);
    this.afU = paramInt2;
    this.afV = paramInt3;
    this.afW = jA();
    this.afX = new SecureRandom();
  }
  
  public static String b(Collection<Character> paramCollection)
  {
    char[] arrayOfChar = new char[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    int i = 0;
    while (paramCollection.hasNext())
    {
      arrayOfChar[i] = ((Character)paramCollection.next()).charValue();
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static boolean bP(int paramInt)
  {
    return (paramInt < 32) || (paramInt > 126);
  }
  
  private int[] jA()
  {
    int[] arrayOfInt = new int[95];
    Arrays.fill(arrayOfInt, -1);
    Iterator localIterator = this.afS.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int k = arrayOfChar.length;
      int j = 0;
      while (j < k)
      {
        arrayOfInt[(arrayOfChar[j] - ' ')] = i;
        j += 1;
      }
      i += 1;
    }
    return arrayOfInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel);
  }
  
  public static final class a
  {
    private final List<String> afS = new ArrayList();
    private final List<Integer> afT = new ArrayList();
    private int afU = 12;
    private int afV = 16;
    private final TreeSet<Character> afY = new TreeSet();
    
    private static TreeSet<Character> h(String paramString1, String paramString2)
    {
      if (TextUtils.isEmpty(paramString1)) {
        throw new PasswordSpecification.b(paramString2 + " cannot be null or empty");
      }
      TreeSet localTreeSet = new TreeSet();
      paramString1 = paramString1.toCharArray();
      int j = paramString1.length;
      int i = 0;
      while (i < j)
      {
        char c = paramString1[i];
        if (PasswordSpecification.bP(c)) {
          throw new PasswordSpecification.b(paramString2 + " must only contain ASCII printable characters");
        }
        localTreeSet.add(Character.valueOf(c));
        i += 1;
      }
      return localTreeSet;
    }
    
    public final a aa(String paramString)
    {
      this.afY.addAll(h(paramString, "allowedChars"));
      return this;
    }
    
    public final a ab(String paramString)
    {
      paramString = h(paramString, "requiredChars");
      this.afS.add(PasswordSpecification.b(paramString));
      this.afT.add(Integer.valueOf(1));
      return this;
    }
    
    public final a jB()
    {
      this.afU = 12;
      this.afV = 16;
      return this;
    }
    
    public final PasswordSpecification jC()
    {
      if (this.afY.isEmpty()) {
        throw new PasswordSpecification.b("no allowed characters specified");
      }
      Object localObject = this.afT.iterator();
      for (int i = 0; ((Iterator)localObject).hasNext(); i = ((Integer)((Iterator)localObject).next()).intValue() + i) {}
      if (i > this.afV) {
        throw new PasswordSpecification.b("required character count cannot be greater than the max password size");
      }
      localObject = new boolean[95];
      Iterator localIterator = this.afS.iterator();
      while (localIterator.hasNext())
      {
        char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
        int j = arrayOfChar.length;
        i = 0;
        while (i < j)
        {
          char c = arrayOfChar[i];
          if (localObject[(c - ' ')] != 0) {
            throw new PasswordSpecification.b("character " + c + " occurs in more than one required character set");
          }
          localObject[(c - ' ')] = 1;
          i += 1;
        }
      }
      return new PasswordSpecification(1, PasswordSpecification.b(this.afY), this.afS, this.afT, this.afU, this.afV);
    }
  }
  
  public static final class b
    extends Error
  {
    public b(String paramString)
    {
      super();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\PasswordSpecification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
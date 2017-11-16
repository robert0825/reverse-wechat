package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayy
  extends ayx
{
  public String nDt;
  public String ojE;
  public String ojF;
  public int ojr;
  public String tRL;
  public int uNi;
  public String uNj;
  public int uNk;
  public int uNl;
  
  public ayy()
  {
    GMTrace.i(20867367043072L, 155474);
    GMTrace.o(20867367043072L, 155474);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20867501260800L, 155475);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ojE != null) {
        paramVarArgs.e(2, this.ojE);
      }
      if (this.ojF != null) {
        paramVarArgs.e(3, this.ojF);
      }
      if (this.nDt != null) {
        paramVarArgs.e(4, this.nDt);
      }
      paramVarArgs.fk(5, this.ojr);
      paramVarArgs.fk(6, this.uNi);
      if (this.uNj != null) {
        paramVarArgs.e(7, this.uNj);
      }
      paramVarArgs.fk(8, this.uNk);
      paramVarArgs.fk(9, this.uNl);
      if (this.tRL != null) {
        paramVarArgs.e(10, this.tRL);
      }
      GMTrace.o(20867501260800L, 155475);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.ojE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ojE);
      }
      i = paramInt;
      if (this.ojF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ojF);
      }
      paramInt = i;
      if (this.nDt != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nDt);
      }
      i = paramInt + b.a.a.a.fh(5, this.ojr) + b.a.a.a.fh(6, this.uNi);
      paramInt = i;
      if (this.uNj != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uNj);
      }
      i = paramInt + b.a.a.a.fh(8, this.uNk) + b.a.a.a.fh(9, this.uNl);
      paramInt = i;
      if (this.tRL != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tRL);
      }
      GMTrace.o(20867501260800L, 155475);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20867501260800L, 155475);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayy localayy = (ayy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20867501260800L, 155475);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 2: 
        localayy.ojE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 3: 
        localayy.ojF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 4: 
        localayy.nDt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 5: 
        localayy.ojr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 6: 
        localayy.uNi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 7: 
        localayy.uNj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 8: 
        localayy.uNk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      case 9: 
        localayy.uNl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20867501260800L, 155475);
        return 0;
      }
      localayy.tRL = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20867501260800L, 155475);
      return 0;
    }
    GMTrace.o(20867501260800L, 155475);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
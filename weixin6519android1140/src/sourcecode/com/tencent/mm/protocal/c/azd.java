package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class azd
  extends com.tencent.mm.bm.a
{
  public String lPM;
  public String uNA;
  public int uNx;
  public int uNy;
  public LinkedList<beb> uNz;
  public int ufa;
  public String ugH;
  public com.tencent.mm.bm.b ugp;
  
  public azd()
  {
    GMTrace.i(4008949317632L, 29869);
    this.uNz = new LinkedList();
    GMTrace.o(4008949317632L, 29869);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4009083535360L, 29870);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugH == null) {
        throw new b.a.a.b("Not all required fields were included: MD5");
      }
      if (this.lPM == null) {
        throw new b.a.a.b("Not all required fields were included: Url");
      }
      if (this.uNA == null) {
        throw new b.a.a.b("Not all required fields were included: OriginalMD5");
      }
      if (this.ugH != null) {
        paramVarArgs.e(1, this.ugH);
      }
      paramVarArgs.fk(2, this.uNx);
      if (this.lPM != null) {
        paramVarArgs.e(3, this.lPM);
      }
      paramVarArgs.fk(4, this.uNy);
      paramVarArgs.d(5, 8, this.uNz);
      if (this.ugp != null) {
        paramVarArgs.b(6, this.ugp);
      }
      if (this.uNA != null) {
        paramVarArgs.e(7, this.uNA);
      }
      paramVarArgs.fk(8, this.ufa);
      GMTrace.o(4009083535360L, 29870);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ugH != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ugH) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uNx);
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPM);
      }
      i = paramInt + b.a.a.a.fh(4, this.uNy) + b.a.a.a.c(5, 8, this.uNz);
      paramInt = i;
      if (this.ugp != null) {
        paramInt = i + b.a.a.a.a(6, this.ugp);
      }
      i = paramInt;
      if (this.uNA != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uNA);
      }
      paramInt = b.a.a.a.fh(8, this.ufa);
      GMTrace.o(4009083535360L, 29870);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uNz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugH == null) {
        throw new b.a.a.b("Not all required fields were included: MD5");
      }
      if (this.lPM == null) {
        throw new b.a.a.b("Not all required fields were included: Url");
      }
      if (this.uNA == null) {
        throw new b.a.a.b("Not all required fields were included: OriginalMD5");
      }
      GMTrace.o(4009083535360L, 29870);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      azd localazd = (azd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4009083535360L, 29870);
        return -1;
      case 1: 
        localazd.ugH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 2: 
        localazd.uNx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 3: 
        localazd.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 4: 
        localazd.uNy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((beb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localazd.uNz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 6: 
        localazd.ugp = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      case 7: 
        localazd.uNA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4009083535360L, 29870);
        return 0;
      }
      localazd.ufa = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4009083535360L, 29870);
      return 0;
    }
    GMTrace.o(4009083535360L, 29870);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
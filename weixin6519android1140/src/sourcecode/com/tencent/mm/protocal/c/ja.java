package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ja
  extends ayx
{
  public String lSX;
  public String lSY;
  public int tOG;
  public int tQP;
  public String tQb;
  public String tYA;
  public int tYB;
  public int tYC;
  public int tYD;
  public int tYE;
  public String tYF;
  public int tYG;
  public int tYH;
  public int tYI;
  public String tYu;
  public int tYv;
  public int tYw;
  public azp tYx;
  public float tYy;
  public float tYz;
  
  public ja()
  {
    GMTrace.i(3721454944256L, 27727);
    GMTrace.o(3721454944256L, 27727);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3721589161984L, 27728);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tYu != null) {
        paramVarArgs.e(1, this.tYu);
      }
      if (this.lSY != null) {
        paramVarArgs.e(2, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(3, this.lSX);
      }
      paramVarArgs.fk(4, this.tYv);
      paramVarArgs.fk(5, this.tYw);
      if (this.tQb != null) {
        paramVarArgs.e(6, this.tQb);
      }
      if (this.tYx != null)
      {
        paramVarArgs.fm(7, this.tYx.aYq());
        this.tYx.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.tOG);
      paramVarArgs.n(9, this.tYy);
      paramVarArgs.n(10, this.tYz);
      if (this.tYA != null) {
        paramVarArgs.e(11, this.tYA);
      }
      paramVarArgs.fk(12, this.tYB);
      paramVarArgs.fk(13, this.tYC);
      paramVarArgs.fk(14, this.tYD);
      paramVarArgs.fk(15, this.tYE);
      if (this.tYF != null) {
        paramVarArgs.e(16, this.tYF);
      }
      paramVarArgs.fk(17, this.tYG);
      paramVarArgs.fk(18, this.tYH);
      paramVarArgs.fk(19, this.tYI);
      paramVarArgs.fk(20, this.tQP);
      GMTrace.o(3721589161984L, 27728);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tYu != null) {
        i = b.a.a.b.b.a.f(1, this.tYu) + 0;
      }
      paramInt = i;
      if (this.lSY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSY);
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSX);
      }
      i = i + b.a.a.a.fh(4, this.tYv) + b.a.a.a.fh(5, this.tYw);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQb);
      }
      i = paramInt;
      if (this.tYx != null) {
        i = paramInt + b.a.a.a.fj(7, this.tYx.aYq());
      }
      i = i + b.a.a.a.fh(8, this.tOG) + (b.a.a.b.b.a.cK(9) + 4) + (b.a.a.b.b.a.cK(10) + 4);
      paramInt = i;
      if (this.tYA != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tYA);
      }
      i = paramInt + b.a.a.a.fh(12, this.tYB) + b.a.a.a.fh(13, this.tYC) + b.a.a.a.fh(14, this.tYD) + b.a.a.a.fh(15, this.tYE);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tYF);
      }
      i = b.a.a.a.fh(17, this.tYG);
      int j = b.a.a.a.fh(18, this.tYH);
      int k = b.a.a.a.fh(19, this.tYI);
      int m = b.a.a.a.fh(20, this.tQP);
      GMTrace.o(3721589161984L, 27728);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3721589161984L, 27728);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ja localja = (ja)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3721589161984L, 27728);
        return -1;
      case 1: 
        localja.tYu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 2: 
        localja.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 3: 
        localja.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 4: 
        localja.tYv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 5: 
        localja.tYw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 6: 
        localja.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localja.tYx = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 8: 
        localja.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 9: 
        localja.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 10: 
        localja.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 11: 
        localja.tYA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 12: 
        localja.tYB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 13: 
        localja.tYC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 14: 
        localja.tYD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 15: 
        localja.tYE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 16: 
        localja.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 17: 
        localja.tYG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 18: 
        localja.tYH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      case 19: 
        localja.tYI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3721589161984L, 27728);
        return 0;
      }
      localja.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3721589161984L, 27728);
      return 0;
    }
    GMTrace.o(3721589161984L, 27728);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
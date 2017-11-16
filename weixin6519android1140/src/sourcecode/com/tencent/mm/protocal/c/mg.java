package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mg
  extends ayx
{
  public String eBt;
  public String lQa;
  public int tOG;
  public String ucY;
  public String ucZ;
  public String uda;
  public String udb;
  public String udc;
  public String udd;
  public String ude;
  
  public mg()
  {
    GMTrace.i(14517526331392L, 108164);
    GMTrace.o(14517526331392L, 108164);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14517660549120L, 108165);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ucY != null) {
        paramVarArgs.e(2, this.ucY);
      }
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.ucZ != null) {
        paramVarArgs.e(4, this.ucZ);
      }
      if (this.uda != null) {
        paramVarArgs.e(5, this.uda);
      }
      if (this.udb != null) {
        paramVarArgs.e(6, this.udb);
      }
      if (this.udc != null) {
        paramVarArgs.e(7, this.udc);
      }
      if (this.udd != null) {
        paramVarArgs.e(8, this.udd);
      }
      if (this.lQa != null) {
        paramVarArgs.e(9, this.lQa);
      }
      paramVarArgs.fk(10, this.tOG);
      if (this.ude != null) {
        paramVarArgs.e(11, this.ude);
      }
      GMTrace.o(14517660549120L, 108165);
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
      if (this.ucY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ucY);
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eBt);
      }
      paramInt = i;
      if (this.ucZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ucZ);
      }
      i = paramInt;
      if (this.uda != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uda);
      }
      paramInt = i;
      if (this.udb != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.udb);
      }
      i = paramInt;
      if (this.udc != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.udc);
      }
      paramInt = i;
      if (this.udd != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.udd);
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.lQa);
      }
      i += b.a.a.a.fh(10, this.tOG);
      paramInt = i;
      if (this.ude != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ude);
      }
      GMTrace.o(14517660549120L, 108165);
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
      GMTrace.o(14517660549120L, 108165);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mg localmg = (mg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14517660549120L, 108165);
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
          localmg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 2: 
        localmg.ucY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 3: 
        localmg.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 4: 
        localmg.ucZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 5: 
        localmg.uda = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 6: 
        localmg.udb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 7: 
        localmg.udc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 8: 
        localmg.udd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 9: 
        localmg.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      case 10: 
        localmg.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14517660549120L, 108165);
        return 0;
      }
      localmg.ude = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(14517660549120L, 108165);
      return 0;
    }
    GMTrace.o(14517660549120L, 108165);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\mg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
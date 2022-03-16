package Keccak;

import java.nio.charset.StandardCharsets;

import static Keccak.HexUtils.convertBytesToString;
import static Keccak.Parameters.*;

public class Main {
    public static void main(String[] args) {
        byte[] data = "ho minh canh cute cute lam nha".getBytes(StandardCharsets.UTF_8);

        Keccak keccak = new Keccak();

        System.out.println("keccak-224 = " + convertBytesToString(keccak.getHash(data, KECCAK_224)));
        System.out.println("keccak-256 = " + convertBytesToString(keccak.getHash(data, KECCAK_256)));
        System.out.println("keccak-384 = " + convertBytesToString(keccak.getHash(data, KECCAK_384)));
        System.out.println("keccak-512 = " + convertBytesToString(keccak.getHash(data, KECCAK_512)));

        System.out.println("sha3-224 = " + convertBytesToString(keccak.getHash(data, SHA3_224)));
        System.out.println("sha3-256 = " + convertBytesToString(keccak.getHash(data, SHA3_256)));
        System.out.println("sha3-384 = " + convertBytesToString(keccak.getHash(data, SHA3_384)));
        System.out.println("sha3-512 = " + convertBytesToString(keccak.getHash(data, SHA3_512)));

        System.out.println("shake128 = " + convertBytesToString(keccak.getHash(data, SHAKE128)));
        System.out.println("shake256 = " + convertBytesToString(keccak.getHash(data, SHAKE256)));
    }
}

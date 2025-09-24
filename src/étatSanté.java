public enum étatSanté {
    SAIN {
        public String afficherEtatSanté() {
            return "sain";
        }
    },
    SOIN_LEGER {
        public String afficherEtatSanté() {
            return "soin leger";
        }
    },
    SOIN_INTENSIF {
        public String afficherEtatSanté() {
            return "soin intensif";
        }
    };

    public abstract String afficherEtatSanté();
}

